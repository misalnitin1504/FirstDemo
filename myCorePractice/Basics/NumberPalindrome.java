package com.prominentpixel.myCorePractice.Basics;

public class NumberPalindrome {  
	public static void main(String args[]) {
		
	int n1=102; 
	int n2=0; 
	
	int temp=n1;  
	while(n1!=0) { 
		int rem=n1%10; 
		n2=n2*10+rem; 
		n1=n1/10;
		
	}
	n1=temp;	
	
	if(n1==n2) {
		System.out.println("Number is Palindrome.");
		
	}else {
		System.out.println("Number is not Palindrome.");
	}
}
}