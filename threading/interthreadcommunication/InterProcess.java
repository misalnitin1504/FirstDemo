package com.prominentpixel.threading.interthreadcommunication;

class MyData1
{
    int value;
    boolean flag=true;

    synchronized public void set(int v)
    {
        while(flag!=true)
            try {wait();}catch(Exception e){}

        value=v;
        flag=false;
        notify();
    }

    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
            try {wait();}catch(Exception e){}


        x=value;
        flag=true;
        notify();

        return x;
    }
}

class Producer1 extends Thread
{
    MyData1 data;

    public Producer1(MyData1 d)
    {
        data=d;
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            data.set(count);
            System.out.println("\nProducer "+count);
            count++;
        }
    }
}

class Consumer1 extends Thread
{
    MyData1 data;

    public Consumer1(MyData1 d)
    {
        data=d;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value=data.get();
            System.out.println("\nConsumer "+value);
        }
    }
}

public class InterProcess
{
    public static void main(String[] args)
    {
        MyData1 data= new MyData1();

        Producer1 p=new Producer1(data);
        Consumer1 c=new Consumer1(data);

        p.start();
        c.start();

    }
}