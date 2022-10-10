package com.prominentpixel.inheritance;

public class Test {
    public static void main(String[] args) {


    Employee e=new Employee("Nitin",32,"8905674813","137-A, Avirbhav-2",21000,"web developer", "IT");
    //e.name="Nitin";
    Manager m=new Manager("Nitin",31,"8905674813","137-B, Avirbhav-2",300000,"web developer", "IT");
    //m.name="Nitin";
        System.out.println(e);
        System.out.println(m);

         e.printSalary();
         m.printSalary();
    }
}
