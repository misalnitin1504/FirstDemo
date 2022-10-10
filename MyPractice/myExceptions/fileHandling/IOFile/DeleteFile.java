package MyPractice.myExceptions.fileHandling.IOFile;

	import java.io.File;  // Import the File class
	import java.io.IOException;  // Import the IOException class to handle errors

	public class DeleteFile {
	  public static void main(String[] args) {
	    try { 
	    		 
	    		File myObj = new File("myfile.txt"); // File to be deleted
	    		if (myObj.delete()) {
	    			System.out.println("Deleted: " + myObj.getName()); 
	    			
	            } else {
	            	System.out.println("Failed.");
	              } 
	    		
	    } catch (Exception e) {
	    		System.out.println("An error occurred.");
	    		e.printStackTrace();
	    }
	  }
	}
