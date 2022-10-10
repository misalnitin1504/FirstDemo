package com.prominentpixel.jdbcdemos.callabledemos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//drop index traineeage_index;
public class Demo06CreateIndex {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres", "postgres");
            CallableStatement cs = con.prepareCall("call delete_trainee()");
            /*cs.setString(1,"Yatin");

            cs.setString(2,"Delhi");
            cs.setDate(3, Date.valueOf("1995-06-02"));
            cs.setDate(4, Date.valueOf("2022-06-02"));
            cs.setInt(5,28);
            cs.setInt(6,1);*/
            cs.executeUpdate();  //I forgot to write this line
            System.out.println("Record Deleted....");
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

