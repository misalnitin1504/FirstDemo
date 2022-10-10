package com.prominentpixel.lamdademos.lamdaexerciseedemos;

import com.prominentpixel.collectiondemos.mydemos.Student;

public class ProminentTrainee {
    int id;
    String name;

    int age;
    String dob;
    ProminentTrainee(){}
    ProminentTrainee(int id,String name, int age, String dob){
        this.id=id;
        this.name=name;
        this.age=age;
        this.dob=dob;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }



    @Override
    public String toString() {
         return id+" "+name+" "+age+" "+dob;
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
        ProminentTrainee t = (ProminentTrainee) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
       return (t.id==this.id );
        //return (t.name == this.name);
       // return (t.id==this.id && t.name == this.name && t.age==this.age && t.dob==this.dob);

    }

    @Override
    public int hashCode() {
        return this.id;
    }


}
