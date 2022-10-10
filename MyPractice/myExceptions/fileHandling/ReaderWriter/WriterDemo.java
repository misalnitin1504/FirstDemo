package MyPractice.myExceptions.fileHandling.ReaderWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {  
            Writer w = new FileWriter("output.txt");  
            String content = "I love my country";  
            w.write(content);    
            w.append('A');
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
	}
}
