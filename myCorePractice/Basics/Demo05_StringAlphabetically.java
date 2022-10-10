package com.prominentpixel.myCorePractice.Basics;

import java.util.Arrays;

public class Demo05_StringAlphabetically {

		static void sortString(String str) { 
	        char []arr = str.toCharArray(); 
	        Arrays.sort(arr); 
	        System.out.print(String.valueOf(arr)); 
	    } 
	  
	// Driver program to test above function  
	    public static void main(String[] args) { 
	        String s = "gangamai"; 
	        sortString(s); 
	}

}
