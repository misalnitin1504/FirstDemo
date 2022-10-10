package com.prominentpixel.jdbcdemos.callabledemos;

import java.sql.*;

/*  // call UPDATE_trainee('Salman', 'Mumbai','1970-02-02','1995-03-03',45,01);
CREATE or REPLACE PROCEDURE update_trainee(_name varchar,_address varchar,_dob date, _joindate date,_age int,_id int)
 LANGUAGE plpgsql
 as $$
 BEGIN
 	update trainee set  traineename=_name, traineeaddress=_address,traineedob=_dob,traineejoiningdate=_joindate,traineeage=_age where traineeid=_id;
 END;
$$;

*/
public class Demo02UpdateRecord01 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres", "postgres");
            CallableStatement cs = con.prepareCall("call update_trainee(?,?,?,?,?,?)");
            cs.setString(1,"Sushant");
            cs.setString(2,"Delhi");
            cs.setDate(3, Date.valueOf("1995-06-02"));
            cs.setDate(4, Date.valueOf("2022-06-02"));
            cs.setInt(5,28);
            cs.setInt(6,1);
            cs.executeUpdate();  //I forgot to write this line
            System.out.println("Record Updated....");

        }  catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
