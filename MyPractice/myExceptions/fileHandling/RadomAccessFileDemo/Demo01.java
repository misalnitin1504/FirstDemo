package MyPractice.myExceptions.fileHandling.RadomAccessFileDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class Demo01 { 
	int id; 
	String name;
	public void setData() {
		try(RandomAccessFile raf=new RandomAccessFile("Employee.dat","rw");  
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){ 
			System.out.print("Enter emp id:"); 
			 id= Integer.parseInt(br.readLine()); 
			System.out.print("Enter emp name:"); 
			 name= br.readLine();
			raf.writeInt(id); 
			raf.writeUTF(name);

		} 
		catch(Exception e) { 
			
			
		}
	} 
	public void getData() { 
		try{ 
			RandomAccessFile raf=new RandomAccessFile("Employee.dat","r"); 
			while(raf.getFilePointer()<raf.length()) {
				//raf.seek(5);
				//int m=re
				id=raf.readInt(); 
				name=raf.readUTF(); 
				System.out.print("Id:"+id); 
				System.out.print(" Name:"+name);
				
			}
		}catch(Exception e) {
			
		} 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo01 d=new Demo01(); 
		d.setData();
		d.getData();
	}

}
/*--------O/P---------
Enter emp id:01
Enter emp name:Nitin
Id:1 Name:Nitin
* */