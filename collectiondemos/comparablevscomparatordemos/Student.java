package com.prominentpixel.collectiondemos.comparablevscomparatordemos;

import java.util.Objects;

public class Student {//implements Comparable<Student>{
    private int id;

    private String name;
    private String college;
    private String grade;//FIRST CLASS,SECOND CLASS
    public Student(){}
    Student(int id,String name, String college,String grade){
        this.id=id;
        this.name=name;
        this.college=college;
        this.grade=grade;

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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
         return id+" "+name+" "+college+" "+grade+" ";
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
        Student s = (Student) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        //return (s.getId() ==this.id );
        //return (s.getName() == this.name);
        return (s.id==this.id && s.name == this.name && s.college == this.college && s.grade==this.grade);

    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
/*
    @Override
    public int compareTo(Student s) {
       // return this.id.compareTo(s.id);
    }*/

