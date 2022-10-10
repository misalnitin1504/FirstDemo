package MyPractice.myExceptions.CollectionDemos.Algorithms;
import java.util.ArrayList;
import java.util.*;

public class AlgorithmsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		List<Integer> list = new ArrayList<Integer>();  
        list.add(30);  
        list.add(10);  
        list.add(20); 
        System.out.println("Given List: "+list );
        
        System.out.println("Min element in list: "+Collections.min(list));
        System.out.println("Max element in list: "+Collections.max(list));
        System.out.println("Binary Search 20 in list: "+Collections.binarySearch(list, 20) );
        System.out.println("Binary Search 10 in list: "+Collections.binarySearch(list, 10) );
        System.out.println("Binary Search 30 in list: "+Collections.binarySearch(list, 30) );
        
        System.out.print("Rotate by 1:");
        	Collections.rotate(list, 1); System.out.println(list);
        System.out.print("Rotate by 2:");
        	Collections.rotate(list, 2); System.out.println(list);
        
        System.out.print("Shaffale:");
        	Collections.shuffle(list);; System.out.println(list);
        System.out.print("Sort:");
        	Collections.sort(list);; System.out.println(list);
        System.out.print("Reverse Order:");
        	Collections.sort(list,Collections.reverseOrder()); System.out.println(list);
        System.out.print("Reverse:");
        	Collections.reverse(list); System.out.println(list);
        	list.clear();
        System.out.print("addAll:");
        	Collections.addAll(list,10,20,30,40,50); System.out.println(list);
        System.out.print("replaceAll 20 to 50:");
        	Collections.replaceAll(list, 20, 50); System.out.println(list);
        System.out.print("Swap 0, 2:");
    		Collections.swap(list, 0, 2); System.out.println(list);
    	System.out.print("After fill 10:");
    		Collections.fill(list, 10); System.out.println(list);      	
              
        List<Integer> list1 = new ArrayList<Integer>();  
        list1.add(100);  
        list1.add(200);  
        list1.add(300);
        Collections.copy(list,list1);
        System.out.println("List "+list ); 
        boolean isCommon=Collections.disjoint(list, list1);
        System.out.println("Output: "+isCommon ); 
        
	}

}
