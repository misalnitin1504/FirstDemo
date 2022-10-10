package MyPractice.myExceptions.jdbcdemos.StatmentDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SD03Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");
			
			Statement st=con.createStatement(); 
			
			int update=st.executeUpdate("update example set rn=04 where rn=03"); 
			
			con.close();
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
