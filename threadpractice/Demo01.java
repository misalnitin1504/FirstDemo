package com.prominentpixel.threadpractice;
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
}
public class Demo01 {
    public static void main(String[] args) {
        MyThread t=new MyThread("My Thread 1");
        System.out.println("Id="+t.getId());
        System.out.println("Name="+t.getName());
        System.out.println("Priority="+t.getPriority());
        t.start();

        System.out.println("State="+t.getState());
        System.out.println("Alive="+t.isAlive());
        System.out.println("Daemon= "+t.isDaemon());
        System.out.println("Interrupted= "+t.isInterrupted());

    }
}
