package com.prominentpixel.threading;

public class OddThread2 extends Thread{
    @Override
    public void run() {
        synchronized (this) {
            System.out.println();

            try {
                for (int i = 0; i < 10; i++) {
                    if ((i % 2) != 0) {/*
                 StringBuffer sbf=new StringBuffer("Nitin");
                 sbf.append(" A. Misal");
                 System.out.println("string is:"+ sbf.toString());*/
                        System.out.print(" " + i);
                        try {
                            Thread.sleep(1000);
                            wait();
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
