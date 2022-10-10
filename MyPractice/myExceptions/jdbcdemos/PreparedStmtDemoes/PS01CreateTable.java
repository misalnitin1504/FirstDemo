package MyPractice.myExceptions.jdbcdemos.PreparedStmtDemoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PS01CreateTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.postgresql.Driver");
			//DriverManager.registerDriver(new org.postgresql.Driver());

			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres","postgres");
			//jdbc:postgresql:ProductDB?user=root&password=secret
			PreparedStatement ps=con.prepareStatement("create table example2(rn int(2), name varchar(20));");
			int create=ps.executeUpdate(); 
			 
			con.close();
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 


	}

}
