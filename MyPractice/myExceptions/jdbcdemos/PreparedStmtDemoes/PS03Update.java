package MyPractice.myExceptions.jdbcdemos.PreparedStmtDemoes;

import java.sql.*;

public class PS03Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.postgresql.Driver");
			//DriverManager.registerDriver(new org.postgresql.Driver());

			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres","postgres");
			//jdbc:postgresql:ProductDB?user=root&password=secret
			PreparedStatement ps=con.prepareStatement("update trainee set  traineename=?, traineeaddress=?,traineedob=?,traineejoiningdate=?,traineeage=? where traineeid=?");
			//update trainee set traineename='Swapnil' WHERE traineedob='1995-01-01';
			ps.setString(1,"Kuldeep");

			ps.setString(2,"111-A");
			ps.setDate(3, Date.valueOf("1995-12-12"));
			ps.setDate(4, Date.valueOf("2022-12-12"));
			ps.setInt(5,30);
			ps.setInt(6,1);
			int update=ps.executeUpdate(); 
			 
			con.close();
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
