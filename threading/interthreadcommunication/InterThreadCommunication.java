package com.prominentpixel.threading.interthreadcommunication;
import java.lang.Thread;
class MyData {
    int value=0;
    boolean flag=true;

    synchronized public void set(int v)   {
        while (flag!=true){
            try {wait();}catch (Exception e){}
            value=v;
            flag=false;
            notify();
        }

    }

    synchronized public int get() {
        int x=0;
        while (flag!=false){
            try {
                wait();
            }catch (Exception e){}

        }
        x=value;
        flag=true;
        notify();
        return x;
    }

}

class Producer extends Thread{
    MyData d;
    Producer(MyData data){
        d=data;
    }
    @Override
    public void run(){
        int count=1;
        while (true){
                d.set(count);
                System.out.println("Producer : "+count);
                count++;
        }
    }
}
class Consumer extends Thread {
    MyData d;

    Consumer(MyData data) {
        d = data;
    }
    @Override
    public void run() {
        int value;
        while (true) {
            value=d.get();
            System.out.println("Consumer: " + value);
        }

    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        MyData d = new MyData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();

    }
}
