package MyPractice.myExceptions.fileHandling.IOFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.io.*;
public class CopyFileDemo {  
	
	private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
	    Files.copy(source.toPath(), dest.toPath()); 
	    System.out.println("Copy File Success");        
	    
	} 
	private static void copyFileUsingStream(File source, File dest) throws IOException {
	    InputStream is = null;
	    OutputStream os = null;
	    try {
	        is = new FileInputStream(source);
	        os = new FileOutputStream(dest);
	        byte[] buffer = new byte[1024];
	        int length;
	        while ((length = is.read(buffer)) > 0) {
	            os.write(buffer, 0, length);
	        }
	    } finally {
	        is.close();
	        os.close(); 
	        System.out.println("Copy File Success");
	    }
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File source = new File("myfile.txt");
        File dest = new File("myfile5.txt");//destination file created at this time, so we need only sorce file in drive 
        System.out.println("Source Location: " + source.getCanonicalPath()); 
	    System.out.println("Destination Location: " + dest.getCanonicalPath());

        //copyFileUsingJava7Files(source, dest);
        copyFileUsingStream(source,dest);
        
	}

}
