package com.prominentpixel.lamdademos;

import com.prominentpixel.streamapi.Product;

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return id+" "+name;
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
        return (s.id==this.id && s.name==this.name );
        //return (p.id==this.id && p.name == this.name && p.price == this.price);

    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
