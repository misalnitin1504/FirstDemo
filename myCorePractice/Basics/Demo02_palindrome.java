package com.prominentpixel.myCorePractice.Basics;

import java.util.Scanner;

public class Demo02_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter String: "); 
		String s1=sc.nextLine();   
		System.out.println("String = "+s1);
		String rev="";
		
		for(int i=s1.length()-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
			
		}
		
		if(s1.equalsIgnoreCase(rev)) {
			System.out.println("String is Palindrome.");
			
		}else {
			System.out.println("String is not Palindrome.");
		}

	}

}
