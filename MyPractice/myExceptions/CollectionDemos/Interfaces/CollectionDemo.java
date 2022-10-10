package MyPractice.myExceptions.CollectionDemos.Interfaces;

import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection collection = new ArrayList();  
		Collection c = new ArrayList();
		collection.add(1); 
		collection.add(2); 
		collection.add(3); 
		System.out.println(collection);	//1
			c.addAll(collection);
		System.out.println(c); //2
			c.remove(2); 
		System.out.println(c); //3
			c.removeAll(c);
		System.out.println(c); //4
		System.out.println(c.isEmpty());//5
			c.addAll(collection); 
		System.out.println(c); //6
			//c.removeIf(filter); It is used to delete all the elements of the collection that satisfy the specified predicate. 
		System.out.println(c.contains(2));//7
		System.out.println(c.containsAll(collection));//8
			c.add(4);
		System.out.println(c);//9
			c.retainAll(collection);//10	except the specified collection,delete all the elements of current collection
		System.out.println(c);  //11
		System.out.println("Using Iterator():");//12
		
		Iterator<Integer> itr=c.iterator();  
	    while(itr.hasNext()){  
	     System.out.println(itr.next());  //13
	    }   
	    System.out.println("Using spiltrator():");//14
	    Spliterator Spltor = c.spliterator(); 
	    Spltor.forEachRemaining((n) -> System.out.println(n));
	    
		//System.out.println(c.stream());
		//System.out.println(c.parallelStream());
		
	    System.out.println(c.equals(collection));
		//System.out.println(c.hashCode());
	   //System.out.println(c.toArray());
		System.out.println(c.toString());//15
		System.out.println("Size="+c.size());//16
		c.clear();
		
		System.out.println(c.isEmpty());
		System.out.println(c);//17
				
	}

}
