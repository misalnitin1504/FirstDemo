package com.prominentpixel.collectiondemos.datastructureexercises;

public class Employee {
    private int id;
    private String name;
    private Float salary;
    public  Employee(){}
    public Employee(int id, String name, Float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+salary;
    }
}
