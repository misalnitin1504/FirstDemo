package com.prominentpixel.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFilterStream02 {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));
        //we are fetching filtered data as a list.
        List<Float> pricesList =  productsList.stream()
                .filter(p -> p.getPrice() > 25000)   // filtering price
                .map(pm -> pm.getPrice())          // fetching price
                .collect(Collectors.toList());  //collecting as list
        System.out.println(pricesList);
    }

}

