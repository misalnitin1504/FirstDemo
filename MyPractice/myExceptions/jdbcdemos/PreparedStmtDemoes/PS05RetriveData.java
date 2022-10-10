package MyPractice.myExceptions.jdbcdemos.PreparedStmtDemoes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class PS05RetriveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password"); 
			 
			PreparedStatement ps=con.prepareStatement("select * from example2");
			ResultSet rs=ps.executeQuery(); 
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
