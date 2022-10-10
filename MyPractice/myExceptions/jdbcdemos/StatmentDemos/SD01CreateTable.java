package MyPractice.myExceptions.jdbcdemos.StatmentDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class SD01CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password"); 
			
			Statement st=con.createStatement(); 
			
			int create=st.executeUpdate("create table example(rn int(2), name varchar(20));");
			
			con.close();
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
