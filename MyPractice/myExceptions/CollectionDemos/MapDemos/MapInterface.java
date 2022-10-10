package MyPractice.myExceptions.CollectionDemos.MapDemos;

import java.util.HashMap;
import java.util.*;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul"); 
		  Map<Integer,String> map1=new HashMap<Integer,String>();  
		  map.put(100,"Nitin");  
		  map.put(101,"Vijay");  
		  map.put(102,"Rahul"); 
		  //Elements can traverse in any order  
		  map.putAll(map1);
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		System.out.println("----------------------------------------------------");
		  map.putIfAbsent(103,"Amit");   //putIfAbsent a key
		  for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		System.out.println("----------------------------------------------------");

		map.remove(103,"Amit");
		  for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		System.out.println("----------------------------------------------------");

		map.remove(102);
		  for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		  }
		  System.out.println("----------------------------------------------------");

		  System.out.println(map.containsKey(100)); //true
		  System.out.println(map.containsValue("Nitin")); //true
		  System.out.println("----------------------------------------------------");

		  System.out.println(map.get(100));
		  System.out.println(map.getOrDefault(100,"Nitin"));
		  System.out.println("----------------------------------------------------");

		  System.out.println(map.replace(100, "Sachin"));
		  System.out.println(map.replace(100,"Sachin", "Nitin"));
		  System.out.println("----------------------------------------------------");
		  System.out.println(map.keySet());
		  System.out.println(map.values());
		  System.out.println(map.size());

	}

}
