package com.prominentpixel.collectiondemos.datastructureexercises;

import javax.lang.model.element.Element;
import java.util.function.BiPredicate;

interface ElementUtils{

    static  Element  betterElement( Element e1, Element e2, BiPredicate<Element, Element> checkElement) {
        if(checkElement.test(e1,e2)){
            //System.out.println(str1);
            return  e1;
        }
        else{
            //System.out.println(str2);
            return e2;
        }

    }

}
public class Demo01 {
    public static void main(String[] args) {
        String str1="Nitin";
        String str2="Kuldeep";
        Car car1=new Car("TATA Nexon", 800000f);
        Car car2=new Car("TATA Punch",600000f);
        Employee employee1=new Employee(1,"XYZ",25000f);
        Employee employee2=new Employee(2,"ABC",30000f);
        /*
        String longerString=ElementUtils.betterElement(str1, str2, (s1, s2) -> s1.length() > s2.length());
        Float highPrice=ElementUtils.betterElement(car1, car2, (c1, c2) -> c1.getPrice() > c2.getPrice());
        Float highSalary=ElementUtils.betterElement(employee1, employee2, (e1, e2) -> e1.getSalary() > e2.getSalary());
        System.out.println(longerString+" "+highPrice+" "+highSalary);
*/
    }
}
