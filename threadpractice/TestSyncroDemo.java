package com.prominentpixel.threadpractice;

public class TestSyncroDemo {
    public static void main(String[] args) {
        final Table obj = new Table();//only one object

        Thread t1=new Thread(){
            public void run(){
                //obj.printTable(5);
                //obj.printTimeStringBuffer("Nitin");
                obj.printTimeStringBuilder("Nitin");
            }
        };
        Thread t2=new Thread(){
            public void run(){
                //obj.printTable(100);
               // obj.printTimeStringBuffer("Nitin");
                obj.printTimeStringBuilder("Nitin");
            }
        };

        t1.start();
        t2.start();
    }
}

