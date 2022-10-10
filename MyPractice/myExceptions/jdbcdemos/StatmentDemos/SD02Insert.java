package MyPractice.myExceptions.jdbcdemos.StatmentDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SD02Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("org.postgresql.Driver");
			//DriverManager.registerDriver(new org.postgresql.Driver());

			//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres","postgres");
			//jdbc:postgresql:ProductDB?user=root&password=secret
			Statement st=con.createStatement(); 
			
			int insert1=st.executeUpdate("insert into example2 values (01, 'Nitin')");
			//int insert2=st.executeUpdate("insert into example values (02, 'Sachin')");
			//int insert3=st.executeUpdate("insert into example values (03, 'Laxmi')");
			//int insert4=st.executeUpdate("insert into example values (04, 'xyz')");
			
			con.close();
		} catch ( SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
