package com.prominentpixel.lamdademos.lamdamydemos.cstomfunctionalinterfaces;

@FunctionalInterface
interface Drawable {
    void draw();
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
    }
}
