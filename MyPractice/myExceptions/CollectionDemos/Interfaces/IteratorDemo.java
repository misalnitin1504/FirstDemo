package MyPractice.myExceptions.CollectionDemos.Interfaces;
// Ways to Iteraorte an Interface
import java.util.ArrayList;
import java.util.*;
@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}
public class IteratorDemo {   
	public static void main(String args[]) {
	List<String> list=new ArrayList<String>(); 
	list.add("Nitin");   
	list.add("Sachin");  
	
    System.out.println(list+"<-----------Using Object");   
    System.out.println(list.toString()+"<-----------Using obj.toString()"); 
    
    //Traversing list through Iterator   
    System.out.println("Traversing list through Iterator:");
    Iterator<String> itr=list.iterator();  
    while(itr.hasNext()){  
     System.out.println(itr.next());  
    }  
     
    ListIterator<String> li=list.listIterator();    
    System.out.println("Traversing forward direction list through List Iterator:"); 
    while(li.hasNext()){
    	System.out.println(li.next());  
    
    } 
    System.out.println("Traversing backward direction list through List Iterator:");
    while(li.hasPrevious()){
    	System.out.println(li.previous());  
    
    }  

    
    
    System.out.println("Using for-each() method with Lambda Expression:");
    list.forEach((name) -> 				//name--we can take any object 
        System.out.println(name)); 
    
    System.out.println("Using forEachRemaining() method with Lambda Expression:");
    Iterator<String> itr1=list.iterator();  
    itr1.forEachRemaining((name)-> System.out.println(name));  
    
    
    System.out.println("forEachRemaining() method using Spiltrator:");
    Spliterator<String> split = list.spliterator();   
    split.forEachRemaining((n) -> System.out.println(n));


    

   System.out.println("Using for loop:");
    for(int i=0;i<list.size();i++) {
        System.out.println(list.get(i));}

    System.out.println("Using for-each loop:");
    for(String name:list) {
        System.out.println(name);
    }
    /*
     System.out.println("Using for-each method with Consumer Interface:");
    list.forEach(new Consumer<String>() {
        @Override
        public void accept(String name) {
            System.out.println(name);
        }
    });*/

   }

}
