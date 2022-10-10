package MyPractice.myExceptions.jdbcdemos.StatmentDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SD05RetriveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password"); 
			Statement st=con.createStatement();  
			ResultSet rs=st.executeQuery("select * from example"); 
			while(rs.next()) { 
				System.out.println(rs.getInt(1)+" "+rs.getString(2)); 
				
			}
			con.close();
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}

	


