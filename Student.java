package com.jsondemos;

public class Student {
    private int id;
    private String name;
    private int salary;

   // private long mobile;
    private String mobile;
    private float marks;
    private boolean isIndian;
    private char gender;


    public Student(){}

    public Student(int id, String name, int salary, String mobile, float marks, boolean isIndian, char gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.mobile = mobile;
        this.marks = marks;
        this.isIndian= isIndian;
        this.gender = gender;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    public boolean isIndian() {
        return isIndian;
    }

    public void setIndian(boolean indian) {
        isIndian = indian;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+salary+" "+mobile+" "+marks+" "+isIndian+" "+gender;
    }
}
