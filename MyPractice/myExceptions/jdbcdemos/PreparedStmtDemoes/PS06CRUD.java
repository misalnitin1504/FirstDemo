package MyPractice.myExceptions.jdbcdemos.PreparedStmtDemoes;

import java.io.*;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PS06CRUD { 
	
	/*public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	    	Class.forName("com.mysql.jdbc.Driver"); 
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password"); 
			  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	} */   
	
	public static void insert(int id, String firstName,String lastName,String eMail,long mobile, String gender,String password) { 
		
		try{ 
			
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password"); 
			
			String sql="insert into student values(?,?,?,?,?,?,?)";
	        PreparedStatement p=con.prepareStatement(sql);
	        p.setInt(1,id);
	        p.setString(2,firstName);
	        p.setString(3,lastName); 
	        p.setString(4,eMail); 
	        p.setLong(5,mobile);
	        p.setString(6,gender); 
	        p.setString(7,password);
	        int insert=p.executeUpdate();
	        System.out.println("Record Added....");
			  
	    }catch(Exception e){System.out.println(e);}  
	    
	}     
//public static void update(String firstName,String lastName,String eMail,long mobile, String gender,String password,int id) { 
	public static void update(String lastName,int id) {
		
		try{ 
			
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password"); 
			
			//String sql="update student set firstName=?, lastName=?, eMail=?, mobile=?, gender=?, password=? where id=?"; 
			String sql="update student set lastName=? where id=?";
	        PreparedStatement p=con.prepareStatement(sql);
	        
	        p.setString(1,lastName);
	        /*p.setString(2,lastName); 
	        p.setString(3,eMail); 
	        p.setLong(4,mobile);
	        p.setString(5,gender); 
	        p.setString(6,password);*/ 
	        p.setInt(2,id);
	        
	        int updat=p.executeUpdate();
	        System.out.println("Record Updated....");
			  
	    }catch(Exception e){System.out.println(e);}  
	    
	}
	public static void delete(int id) { 
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password"); 
			 
			PreparedStatement ps=con.prepareStatement("delete from student where id=?"); 
			ps.setInt(1,id);
			int delete=ps.executeUpdate(); 
			 
			con.close();
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public static void retrive() { 
		
		try{ 
			
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password"); 
			
			String sql="select * from student";
	        PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(); 
			while(rs.next()) { 
				System.out.println(rs.getInt(1)+" "+rs.getString(2)); 
				
			}
			con.close();


	        System.out.println("Record Viewed.");
			  
	    }catch(Exception e){System.out.println(e);}  
	    
	}
		
		
//java.sql.SQLException: Parameter index out of range (4 > number of parameters, which is 3).

	//-------------------------
	//save(User u);//Insert 
	//update(User u); 
	//delete(User u); 
	//getAllRecords();
	//getRecordsById(int id);
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub 
		int id;    
		String firstName, lastName,eMail,gender, password; 
		long mobile; 
		int ans=1;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		while(ans==1) {  
			System.out.println("----------MENU----------------"); 
			System.out.println("1.Insert"); 
			System.out.println("2.Update");
			System.out.println("3.Delete"); 
			System.out.println("4.View Data"); 
			System.out.println("5.Exit"); 
			System.out.println("Enter your Choice:"); 
			int ch=Integer.parseInt(br.readLine());  
			
			 switch(ch) { 
				case 1:     
					System.out.println("Enter Id:"); 
					id=Integer.parseInt(br.readLine());
					System.out.println("Enter First Name:"); 
					firstName=br.readLine(); 
					System.out.println("Enter Last Name:"); 
					lastName=br.readLine();  
					System.out.println("Enter E-mail:");
					eMail= br.readLine();  
					System.out.println("Enter Mobile:");
					mobile= Long.parseLong(br.readLine());  
					
					System.out.println("Enter Gender(Male/Female):");
					gender=br.readLine();   
					System.out.println("Enter Password:");
					password=br.readLine();
					PS06CRUD.insert(id,firstName,lastName,eMail,mobile,gender,password );
						break;
				case 2:     
					
					/*System.out.println("Enter First Name:"); 
					firstName=br.readLine(); */
					System.out.println("Enter Last Name:"); 
					lastName=br.readLine();  /*
					System.out.println("Enter E-mail:");
					eMail= br.readLine();  
					System.out.println("Enter Mobile:");
					mobile= Long.parseLong(br.readLine());  
					
					System.out.println("Enter Gender(Male/Female):");
					gender=br.readLine();   
					System.out.println("Enter Password:");
					password=br.readLine(); */
					System.out.println("Conform Record Id you want to update :"); 
					id=Integer.parseInt(br.readLine());
					//PS06CRUD.update(firstName,lastName,eMail,mobile,gender,password,id); 
					PS06CRUD.update(lastName,id);
					System.out.println("Updation Complited.....");
						break;
				case 3:  
					System.out.println("Enter Id:");  
					id=Integer.parseInt(br.readLine()); 
					PS06CRUD.delete(id);
					System.out.println("Deletion Complited.....");
						break;
				case 4:   
						PS06CRUD.retrive();
						break;
				case 5:  
						System.exit(0);
				default:
					System.out.println("Wrong choice.......try again");
					//continue LOOP;
			}  
			System.out.println("Do you want to continue(1/0)"); 
			ans=Integer.parseInt(br.readLine()); 
			
		}

	}

}
