package com.prominentpixel.jdbcdemos.callabledemos;

import java.sql.*;
//  select * from display_trainee2();
/*
CREATE or REPLACE function display_trainee2()returns setof trainee
 LANGUAGE  SQL
 as
 $$
    select * from trainee ORDER by  traineedob,traineejoiningdate desc;
 $$;

*/
public class Demo07DisplayRecords01 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres", "postgres");
            CallableStatement cs = con.prepareCall(" select * from  display_trainee1();");
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