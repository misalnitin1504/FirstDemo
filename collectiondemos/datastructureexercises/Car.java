package com.prominentpixel.collectiondemos.datastructureexercises;

public class Car {
    private String name;
    private Float price;
    public Car(){}
    public Car(String name,Float price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name+" "+price;
    }
}
