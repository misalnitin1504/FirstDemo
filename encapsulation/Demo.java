package com.prominentpixel.encapsulation;

public class Demo {
    public static void main(String args[]){
        Student s=new Student();
        s.setId(1);
        s.setName("Nitin");
        System.out.println(s);
        System.out.println(s.getId()+" "+s.getName());

    }
}
