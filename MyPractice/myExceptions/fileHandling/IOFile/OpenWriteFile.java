package MyPractice.myExceptions.fileHandling.IOFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class OpenWriteFile { 
	public static void main(String args[]) { 
		try {
		File file=new File("myfile.txt"); 
		FileOutputStream myWriter = new FileOutputStream(file);
		//FileWriter myWriter = new FileWriter(file);
	      //myWriter.write("Files in Java might be tricky, but it is fun enough!"); 
	    String fileContent = "Hello Learner !! Welcome to howtodoinjava.com."; 
	    
	    byte[] strToBytes = fileContent.getBytes();
	    myWriter.write(strToBytes);
	    myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }  
		
	}

}
