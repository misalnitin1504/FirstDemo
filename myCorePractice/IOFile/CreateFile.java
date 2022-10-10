package com.prominentpixel.myCorePractice.IOFile;

	import java.io.File;  // Import the File class
	import java.io.IOException;  // Import the IOException class to handle errors

	public class CreateFile {
	  public static void main(String[] args) {
	    try { 
	    		// 
	    		/* 1. myfile.txt--->File Location:D:\Nitin\Workspace\IOdemos\myfile1.txt
	    		   2. File\\myfile.txt--->File Location:D:\Nitin\Workspace\IOdemos\File\myfile.txt	//Folder must be there 
	    		   3. ..\\myfile.txt--->File Location:D:\Nitin\Workspace\myfile.txt 	//1-Level-up
	    		   4. \\myfile.txt--->File Location: D:\myfile.txt		//Root-Level of drive
	    		   */ 
	    		File myObj = new File("myfile.txt"); //
	    		if (myObj.createNewFile()) {
	    			System.out.println("File created: " + myObj.getName()); 
	    			System.out.println("File Location: " + myObj.getCanonicalPath());
	            } else {
	            	System.out.println("File already exists at Location:"+ myObj.getCanonicalPath());
	              } 
	    		
	    } catch (IOException e) {
	    		System.out.println("An error occurred.");
	    		e.printStackTrace();
	    }
	  }
	}
/*--------O/P---------------
File created: myfile.txt
File Location: E:\Misal\JavaCourse\JavaExcersice\JavaExcersice\myfile.txt

*/