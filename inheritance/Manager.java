package com.prominentpixel.inheritance;

public class Manager extends Member{
    String specialization,department;
    Manager(String name, int age,String phone,String address, int salary, String specialization, String department ){
        super(name, age, phone, address, salary);
        this.specialization=specialization;
        this.department=department;
    }
    /**
     *
     */
    @Override
    public void printSalary() {
        System.out.println("salary of manager:"+this.salary);

    }
    @Override
    public String toString() {
        return name+" "+age+" "+phone+" "+address+" "+salary+" "+specialization+" "+department;
    }
}
