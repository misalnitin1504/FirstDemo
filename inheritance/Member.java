package com.prominentpixel.inheritance;

public abstract class Member {
    String name;
   int age;
    String phone;
    String address;
    int salary;
    Member(String name, int age, String phone,String address, int salary){
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.address=address;
        this.salary=salary;

    }
    abstract void printSalary();
}
