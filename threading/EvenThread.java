package com.prominentpixel.threading;

public class EvenThread implements Runnable
{
        @Override
        public void run() {
            System.out.println();

            try{
                for(int i=0;i<10;i++){
                    if((i%2)==0){

                        System.out.print (" "+i);
                        /*StringBuffer sbf=new StringBuffer("Nitin");
                        sbf.append(" A. Misal");
                        System.out.println("string is:"+ sbf.toString());*/
                        Thread.sleep(1000);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


