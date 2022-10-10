package com.prominentpixel.jdbcdemos.callabledemos;

import java.sql.*;

public class Demo01InsertRecord {
    public static void main(String[] args) {
        try{
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres", "postgres");
        CallableStatement stmt = con.prepareCall("call insert_trainee(?,?,?,?,?,?)");

        stmt.setInt(1, 14);
        stmt.setString(2, "Yatin");
        stmt.setString(3,"Surat");
        stmt.setDate(4, Date.valueOf("1995-01-01"));
        stmt.setDate(5,Date.valueOf("2022-02-02"));
        stmt.setInt(6,28);
        stmt.execute();
        System.out.println("success");
    }  catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
