package com.prominentpixel.exceptionhandling;

public class Demo03 {
    public void nestedTry(){
        //Nested try
        try {
            try {
                int a = 10 / 0;
                //throw new ArithmeticException("Divide by Zero Exception occurred");
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("Exception message:"+e);
            }
        }catch (Exception e){
            e.printStackTrace();

        }finally {
            System.out.println("Finally block executed.........");
        }

    }
    public void useThrows(){

    }
    public void reThrow(){

    }
    public static void main(String[] args) {
        Demo03 d=new Demo03();
        d.nestedTry();
        d.useThrows();
        d.reThrow();
        System.out.println("Rest of the code executed.......");
    }
}
