package com.prominentpixel.threading;

public class OddThread extends Thread{
    @Override
    public void run() {
        System.out.println();

        try{
         for(int i=0;i<10;i++){
             if((i%2)!=0){/*
                 StringBuffer sbf=new StringBuffer("Nitin");
                 sbf.append(" A. Misal");
                 System.out.println("string is:"+ sbf.toString());*/
                 System.out.print (" "+i);
                 Thread.sleep(1000);
             }
         }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
