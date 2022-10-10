package com.prominentpixel.myCorePractice.Basics;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
	  
		System.out.println("-----------String using Char array-----------------------------");
		char ch[]= {'N','I','T','I','N'}; 
		String s=new String(ch);
		String s5=String.valueOf(ch);
		System.out.println(s5 +" "+s);
		
		System.out.println("-----------Length-----------------------------");
		String s1="Nitin";
		String s2=new String(" A. Misal");
		System.out.println("Length: s1.length()="+ s1.length());  
		System.out.println("Length: s2.length()="+ s2.length());
		
		System.out.println("-----------Concat(Join)-----------------------------");
		System.out.println("Concat(join) s1 + s2: "+(s1+s2)); 
		System.out.println("Concat(join) s1.concat(s2): "+s1.concat(s2));
		
		System.out.println("-------------Compare---------------------------");
		String s3="Nitin";  
		String s4=new String("Nitin");
		System.out.println("Comapre s1.equals(s2): "+s1.equals(s2));  
		System.out.println("Comapre s1.equals(s3): "+s1.equals(s3));
		
		System.out.println("Comapre s1==s3: "+ (s1==s3)); 
		System.out.println("Comapre s1==s4: "+ (s1==s4));
		
		System.out.println("Comapre s1.compareTo(s2): "+s1.compareTo(s2));  
		System.out.println("Comapre s1.compareTo(s3): "+s1.compareTo(s3)); 
		
		System.out.println("-------------Copy---------------------------");
		//String s6= s4.clone();
		System.out.println("Copy: s1=s2: "+ (s1=s2)); 
		System.out.println("Copy: s1=s2: " +(s3=s4));
		
		System.out.println("-------------Upper & Lower---------------------------"); 
		System.out.println("UpperCase: s4.toUpperCase() "+ s4.toUpperCase()); 
		System.out.println("UpperCase: s4.toLowerCase() "+ s4.toLowerCase()); 
		System.out.println("-------------Other Methods---------------------------"); 
		System.out.println("");
		
	}

}
