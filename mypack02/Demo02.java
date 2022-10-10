package com.prominentpixel.mypack02;

import com.prominentpixel.mypack01.Demo01;

public class Demo02 extends Demo01 {


    /**
     *
     */
    @Override
    protected void display() {
        i++;
        System.out.println("showing......i="+i);

    }
    public static void  main(String args[]){
        Demo02 d=new Demo02();
        d.display();

    }
}
