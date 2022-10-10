package com.prominentpixel.stringdemos;

public class BufferVSBuilderDemo {
    public static void main(String[] args){
        long startingTime = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer("Code");
        for (int i=0; i<100000; i++){
            sb.append("Speedy");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startingTime) + "ms");
        startingTime = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder("Code");
        for (int i=0; i<100000; i++){
            sb2.append("Speedy");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startingTime) + "ms");
    }

}
