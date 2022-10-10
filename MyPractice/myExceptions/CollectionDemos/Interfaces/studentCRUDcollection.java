package MyPractice.myExceptions.CollectionDemos.Interfaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*; 
class Student implements Comparable<Student> { 
	int rn; 
	String name; 
	Student(int rn, String name){ 
		this.rn=rn; 
		this.name=name;
		
	}
	/*@Override
	 public int compareTo(Student person) {  
	    return name.compareTo(person.name);  
	}*/ 
	@Override
	 public int compareTo(Student s) {
		Integer rnn=rn;
	    return rnn.compareTo(s.rn);
	}
}

public class studentCRUDcollection { 
	  
	  //static //BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 static Student s;
	 static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 static List<Student> list=new LinkedList<Student>(); 
	  
	 static void toInsert() throws Exception, IOException  { 
			
		System.out.print("Enter Roll No:"); 
		int rn=Integer.parseInt(br.readLine());
		System.out.print("Enter Name:") ; 
		String name=br.readLine(); 
		 s=new Student(rn, name);
		list.add(s);  
		
		 
	} 
	 static void toUpdate() throws Exception, IOException{ 
		    System.out.print("Enter Roll No to update data:"); 
			int rn=Integer.parseInt(br.readLine());
			System.out.print("Enter Name:") ; 
			String name=br.readLine(); 
			 s=new Student(rn, name); 
			 list.remove(rn-1);
			 list.add(s);  
			
		
	} 
	 static void toDelete() throws Exception, IOException { 
			System.out.print("Enter Roll No to delete data:"); 
			int rn=Integer.parseInt(br.readLine());
			list.remove(rn-1);  
	} 
	 static void toView() {   
		   Collections.sort(list);  
          for(Student s: list) {
        	  System.out.println(s.rn+" "+s.name);
          }
	} 
	static void toExit() { 
		System.exit(0);
	}
		
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub 
		int ans=1;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
		while(ans==1){
		System.out.println("----------MENU----------------"); 
		System.out.println("1.Insert"); 
		System.out.println("2.Update");
		System.out.println("3.Delete"); 
		System.out.println("4.View Data"); 
		System.out.println("5.Exit"); 
		aa: while(true){
	    System.out.print("Enter your Choice:"); 
		int ch=Integer.parseInt(br.readLine()); 
		 switch(ch) { 
			case 1:  
				toInsert();
				break; 
			case 2:  
				toUpdate();
				break; 
			case 3:  
				toDelete();
				break; 
			case 4:  
				toView();
				break; 
			case 5:  
				toExit();
				break;
			default:  
				 System.out.println("Wrong Choice....try again...."); 
				 break aa;
		
		   }  
		}
		 System.out.print("Do you want to continue(1/0):"); 
		 ans=Integer.parseInt(br.readLine());
		 
		}
} 
}
