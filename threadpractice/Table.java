package com.prominentpixel.threadpractice;

class Table{
     synchronized void printTable(int n){//synchronized method
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){System.out.println(e);}
        }


    }
    void printTimeStringBuffer(String  name)    {

        long startTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer(name);
        for (int i=0; i<10000; i++){
            sb.append("Misal");
        }

        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime)+"ms");

     }
    void printTimeStringBuilder(String  name)    {

        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(name);
        for (int i=0; i<10000; i++){
            sb.append("Misal");
        }

        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime)+"ms");

    }
}