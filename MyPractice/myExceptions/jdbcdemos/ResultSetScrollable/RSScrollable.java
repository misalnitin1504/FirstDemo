package MyPractice.myExceptions.jdbcdemos.ResultSetScrollable;

import java.sql.*;

public class RSScrollable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub  
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password"); 

		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
		ResultSet rs=stmt.executeQuery("select * from example2");  
		  
		//getting the record of 2nd row  
		rs.absolute(2);   
		//rs.relative(2);
		
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "); 
		rs.next();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "); 
		rs.previous();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
		rs.first();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
		rs.last();
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
			
		  
		con.close();  

	}

}
/*---------------------------------- 
3 Laxmi 
4 XYZ 
3 Laxmi 
1 Nitin 
4 XYZ 
 ------------------------------------
 */