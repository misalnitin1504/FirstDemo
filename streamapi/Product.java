package com.prominentpixel.streamapi;

import com.prominentpixel.collectiondemos.mydemos.Student;

public class Product {

    private String name;
    private float price;
    private int  id;
    public Product(){}
    Product(int id, String name, float price){
        this.id=id;
        this.name=name;
        this.price=price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
         return id+" "+name+" "+price;
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
        Product p = (Product) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (p.id==this.id );
        //return (p.id==this.id && p.name == this.name && p.price == this.price);

    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
