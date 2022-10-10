package com.prominentpixel.jdbcdemos.callabledemos;

import java.sql.*;
/* //call update_trainee03('Nitin');
CREATE or REPLACE PROCEDURE update_trainee03(_name varchar)
 LANGUAGE plpgsql
 as $$
 BEGIN
 	update trainee set  traineename=_name  where traineedob='1995-01-01';
 END;
$$;


**/
public class Demo04UpdateRecord03 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres", "postgres");
            CallableStatement cs = con.prepareCall("call update_trainee03(?)");
            cs.setString(1,"Yatin");
            /*
            cs.setString(2,"Delhi");
            cs.setDate(3, Date.valueOf("1995-06-02"));
            cs.setDate(4, Date.valueOf("2022-06-02"));
            cs.setInt(5,28);
            cs.setInt(6,1);*/
            cs.executeUpdate();  //I forgot to write this line
            System.out.println("Record Updated....");

        }  catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
