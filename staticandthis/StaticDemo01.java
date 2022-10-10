package com.prominentpixel.staticandthis;

public class StaticDemo01 {
    static int count=0;
    static void dispaly(){
        count++;
        System.out.println("Count="+count);
    }
    public static void main(String args[]){
        dispaly();
        dispaly();
        dispaly();


    }
}
