package com.prominentpixel.staticandthis;

public class ThisDemo01 {
    int id;
    String name;
    int salary;
    ThisDemo01(){

    }
    //Used with variable for resolving naming ambiguity
    ThisDemo01(int id ){
        this.id=id;
    }
    //Used with Constructor for Constructor Chaining
    ThisDemo01(int id ,String name){
        this(id);
        this.name=name;
        //Used for invoking current class method.......same as calling normal method inside class
        this.display();
    }
    void display(){
        System.out.println("Used for invoking current class method");
    }
    public static void main(String args[]){
        ThisDemo01 demo=new ThisDemo01(1,"Nitin");
        System.out.println(demo.id+" "+demo.name);


    }
}
