package MyPractice.myExceptions.CollectionDemos.MapDemos;

import java.util.*;

public class MapComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      //map.entrySet()--> Returns a Set view  
	      //.stream()     --> Returns a sequential Stream    
	      //.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) --> Sorted according to the provided Comparator
	      //.forEach(System.out::println);     --->  Performs an action for each element of this stream

	      map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	      map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); 
	      map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);   
	      map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	  
	
	}

}
