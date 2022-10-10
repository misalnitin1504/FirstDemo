package com.prominentpixel.filedemos;

import com.prominentpixel.collectiondemos.mydemos.Student;

public class Employee {
    private int empId;
    private String empName;
    private String empMobile;
    private float empSalary;
    private float empBonus;

    private int month;
    private int year;
    public Employee(){}

    public Employee(int empId, String empName, String empMobile, float empSalary, float empBonus, int month, int year) {
        this.empId = empId;
        this.empName = empName;
        this.empMobile = empMobile;
        this.empSalary = empSalary;
        this.empBonus = empBonus;
        this.month = month;
        this.year = year;
    }




    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpMobile() {
        return empMobile;
    }

    public void setEmpMobile(String empMobile) {
        this.empMobile = empMobile;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    public float getEmpBonus() {
        return empBonus;
    }

    public void setEmpBonus(float empBonus) {
        this.empBonus = empBonus;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        // it checks if the argument is of the
        // type Geek by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        Employee employee = (Employee) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (employee.empId==this.empId );
        //return (s.id==this.id && s.name == this.name && s.address == this.address);

    }



    @Override
    public int hashCode() {
        return this.empId;
    }
}





