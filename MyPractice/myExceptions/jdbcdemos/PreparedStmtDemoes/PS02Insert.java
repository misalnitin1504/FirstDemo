package MyPractice.myExceptions.jdbcdemos.PreparedStmtDemoes;

import java.sql.*;

import javax.print.attribute.SetOfIntegerSyntax;

public class PS02Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.postgresql.Driver");
			//DriverManager.registerDriver(new org.postgresql.Driver());

			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres","postgres");
			//jdbc:postgresql:ProductDB?user=root&password=secret
			 
			PreparedStatement ps=con.prepareStatement("insert into trainee  values (?,?,?,?,?,?)");
			//PreparedStatement ps=con.prepareStatement("insert into example2  values (?,?)");

			ps.setInt(1,1);
			ps.setString(2, "Nitin");
			ps.setString(3,"137-A");
			ps.setDate(4, Date.valueOf("1990-09-24"));
			ps.setDate(5, Date.valueOf("2022-09-05"));
			ps.setInt(6,32);
			//
			ps.setInt(1,2);
			ps.setString(2, "Sachin");
			ps.setString(3,"137-A");
			ps.setDate(4, Date.valueOf("1990-09-24"));
			ps.setDate(5, Date.valueOf("2022-09-05"));
			ps.setInt(6,32);

			//
			ps.setInt(1,3);
			ps.setString(2, "Laxmi");
			ps.setString(3,"137-A");
			ps.setDate(4, Date.valueOf("1990-09-24"));
			ps.setDate(5, Date.valueOf("2022-09-05"));
			ps.setInt(6,32);



			/*
			ps.setInt(1,03);
			ps.setString(2, "Yati");
			/*
			ps.setInt(1,03); 
			ps.setString(2, "Laxmi");
			
			ps.setInt(1,04); 
			ps.setString(2, "XYZ");*/
			
			int insert=ps.executeUpdate(); 
			 
			con.close();
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
