package com.prominentpixel.myCorePractice.Basics;

import java.util.Scanner;

public class Demo03_palindromewithfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
		String s1="Nitin"; 
		StringBuffer sbf=new StringBuffer(s1); 
		sbf.reverse();
		String s2=sbf.toString();
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("String is Palindrome.");
			
		}else {
			System.out.println("String is not Palindrome.");
		}
		
	}

}
