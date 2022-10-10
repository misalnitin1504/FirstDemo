package com.prominentpixel.inheritance;

public class Employee extends Member{
    String specialization,department;
    //Employee(){};
    Employee(String name, int age, String phone,String address, int salary, String specialization, String department ){
        super(name, age, phone, address, salary);
        this.specialization=specialization;
        this.department=department;
    }
    /**
     *
     */
    @Override
    public void printSalary() {

        System.out.println("salary of employee:"+this.salary);

    }

    @Override
    public String toString() {
        return name+" "+age+" "+phone+" "+address+" "+salary+" "+specialization+" "+department;
    }
}
