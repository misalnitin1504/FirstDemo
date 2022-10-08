package com.prominentpixel.collectiondemos.mydemos;

public class Student {
    private int id;

    private String name;
    private String address;
    public Student(){}
    public Student(int id, String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
         return id+ " "+ name+" "+address;
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
        Student s = (com.prominentpixel.collectiondemos.mydemos.Student) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (s.id==this.id );
        //return (s.id==this.id && s.name == this.name && s.address == this.address);

    }



    @Override
    public int hashCode() {
        return this.id;
    }
}
