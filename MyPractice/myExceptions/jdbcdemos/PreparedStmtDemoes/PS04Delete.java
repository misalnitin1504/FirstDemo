package MyPractice.myExceptions.jdbcdemos.PreparedStmtDemoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PS04Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.postgresql.Driver");
			//DriverManager.registerDriver(new org.postgresql.Driver());

			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres","postgres");
			//jdbc:postgresql:ProductDB?user=root&password=secret
			PreparedStatement ps=con.prepareStatement("delete from trainee where traineename LIKE 'S%n'"); //
			//
			//ps.setString(1,"LIKE 'S%n'");
			int delete=ps.executeUpdate(); 
			 
			con.close();
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
