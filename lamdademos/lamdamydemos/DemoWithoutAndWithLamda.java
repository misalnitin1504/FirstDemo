package com.prominentpixel.lamdademos.lamdamydemos;
@FunctionalInterface
interface Drawable{
    void draw();
}
@FunctionalInterface
interface Addable{
    int add(int a,int b);
}
public class DemoWithoutAndWithLamda {
    public static void main(String[] args) {
        /*
        Drawable d=new Drawable() {
            @Override
            public void draw() {
                System.out.println("Strat Drawing");
            }
        }; */
        //No need of constructor & overriding method name, can directly use lamda function to impliment abstract method body
        Drawable d=()->{
            System.out.println("Start Drawing.......");
        };
        d.draw();
        Addable ad1=(a,b)->(a+b);
        System.out.println(ad1.add(5,3));
        Addable ad2=(int a,int b)->{return (a+b);};
        System.out.println(ad2.add(5,3));


    }
}
