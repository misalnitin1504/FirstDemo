package MyPractice.myExceptions.jdbcdemos.CallableDemos;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class FunctionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub 
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");
		CallableStatement stmt=con.prepareCall("{?= call adder(?,?)}");
		// ?= this first so 2 & 3 is used
		stmt.setInt(2,10);  
		stmt.setInt(3,20);  
		
		stmt.registerOutParameter(1,Types.INTEGER);  
		stmt.execute();  
		  
		System.out.println(stmt.getInt(1));  
	}

}
