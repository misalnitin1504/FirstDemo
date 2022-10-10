package com.prominentpixel.myCorePractice.IOFile;

import java.io.File;
import java.io.FileInputStream;

public class OpenReadFile { 
	public static void main(String args[]) { 
		try {
		File file=new File("myfile.txt");
		FileInputStream fis=new FileInputStream(file);     //opens a connection to an actual file
		System.out.println("file content: ");  
		int r=0;  
		while((r=fis.read())!=-1)  
		  {  
			System.out.print((char)r);      //prints the content of the file  
		  }  
		}
		catch(Exception e)  
		{  
			e.printStackTrace();  
		}  
		
	}

}
