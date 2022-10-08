package com.prominentpixel.exceptionhandling;

public class DemoPropagation {

	  void m(){  
		   int data=50/0;  
	     }  
	  void n(){
		    try {  m();   
		    }catch(Exception e){System.out.println("exception handled");}  
		  }
	  
	  public static void main(String args[]){  
			  DemoPropagation obj=new DemoPropagation();  
		   obj.n();  
		   System.out.println("normal flow...");  
} 
}
