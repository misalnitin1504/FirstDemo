package MyPractice.myExceptions.jdbcdemos.CallableDemos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	/*	Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","password");*/
		Class.forName("org.postgresql.Driver");
		Connection con= DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres","postgres");

		CallableStatement stmt=con.prepareCall("call INSERTUSER(?,?)");  
		stmt.setInt(1,02);  
		stmt.setString(2,"Sachin");  
		stmt.execute();
		System.out.println("success");
		/* //  call insertex(09,'Drhuva');
		CREATE PROCEDURE insertex(_rn int,_name varchar)
LANGUAGE plpgsql
as $$
BEGIN
	insert into example2 VALUES(_rn,_name);
END; $$;
 		* */
		/* call insert_trainee(13,'Druva','Surat','1995-12-12','2022-05-05',28);
		CREATE or REPLACE PROCEDURE insert_trainee(_id int,_name varchar,_address varchar, _dob date,_joindate date,_age int)
LANGUAGE plpgsql
as $$
BEGIN
	insert into trainee VALUES(_id,_name,_address,_dob,_joindate,_age);
END; $$;
		* */

	}

}
