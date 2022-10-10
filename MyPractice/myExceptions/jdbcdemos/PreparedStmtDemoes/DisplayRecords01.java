package MyPractice.myExceptions.jdbcdemos.PreparedStmtDemoes;

import java.sql.*;

public class DisplayRecords01 {
    public static void main(String[] args) {
        //select * from trainee ORDER by  traineedob,traineejoiningdate desc;
        try {
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres","postgres");
           // PreparedStatement ps=con.prepareStatement("select * from trainee;"); //
            //select * from trainee WHERE traineeaddress='Rajkot' and traineeaddress<>'Ahamadabad';
           // PreparedStatement ps=con.prepareStatement("select * from trainee ORDER by  traineedob,traineejoiningdate desc;");
            PreparedStatement ps=con.prepareStatement("  select * from trainee where traineeage between 20 and 21; "); //

            ResultSet rs=ps.executeQuery();
            //System.out.println(rs.toString());
            while(rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4)+" "+rs.getDate(5)+" "+rs.getInt(6));

            }
            con.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    }


