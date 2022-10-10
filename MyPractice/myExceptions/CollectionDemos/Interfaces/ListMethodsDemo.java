package MyPractice.myExceptions.CollectionDemos.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add(0,"Nitin");
        list.add(1,"Sachin");
        list.addAll(2,list);
        list.addAll(list);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove("Nitin");
        System.out.println(list);
        list.set(0,"Yati");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.indexOf("Yati"));
        System.out.println(list.lastIndexOf("Nitin"));
        System.out.println(list.subList(2,4));//index 4 will not be counted & display object



    }
}
