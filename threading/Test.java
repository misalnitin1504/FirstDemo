package com.prominentpixel.threading;

public class Test {
    public static void main(String[] args) {
        OddThread od=new OddThread();

        od.start();
       // od.run();
        EvenThread ed=new EvenThread();
        Thread t=new Thread(ed);

        t.start();
        //t.run();
        System.out.println("\nMain Thread.....Exit");
    }
}
// 1 0 3 2 4 5 7 6 8 9
// 0 1 3 2 5 4 7 6 9 8
// 1 0 3 2 5 4 7 6 9 8