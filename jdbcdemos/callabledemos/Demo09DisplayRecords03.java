package com.prominentpixel.jdbcdemos.callabledemos;

import java.sql.*;

//  select * from display_trainee3();
/*
CREATE or REPLACE function display_trainee3()returns setof trainee
 LANGUAGE  SQL
 as
 $$
    select * from trainee where traineeage between 20 and 21;
 $$;



*/
public class Demo09DisplayRecords03 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres", "postgres");
            CallableStatement cs = con.prepareCall(" select * from  display_trainee3();");
            System.out.println("Record are....");
            ResultSet rs = cs.executeQuery();
            //System.out.println(rs.toString());
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDate(4) + " " + rs.getDate(5) + " " + rs.getInt(6));

            }
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}