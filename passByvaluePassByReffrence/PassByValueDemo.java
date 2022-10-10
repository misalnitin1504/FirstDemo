package com.prominentpixel.passByvaluePassByReffrence;
//Pass by Value: In the pass by value concept,
// the method is called by passing a value.So, it is called pass by value.
// It does not affect the original parameter.
public class PassByValueDemo {
     int count=0;


    public    void countPrint(int count){
        count++;//changing value it will be locally
        System.out.println("Value locally change Count="+count);

    }


    public static void main(String[] args) {

        //System.out.println("Count="+count);
        PassByValueDemo d=new PassByValueDemo();
        System.out.println("Before change: count="+d.count);
        d.countPrint(50);
        System.out.println("After change: count="+d.count);


    }
}
