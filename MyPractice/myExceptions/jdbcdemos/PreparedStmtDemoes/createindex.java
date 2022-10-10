package MyPractice.myExceptions.jdbcdemos.PreparedStmtDemoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class createindex {
    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
            Connection con= DriverManager.getConnection("jdbc:postgresql://localhost/ProminentPixelTrainee", "postgres","postgres");
            PreparedStatement ps=con.prepareStatement("CREATE INDEX CONCURRENTLY traineeage_index ON trainee (traineeage);"); //

             int create_index=ps.executeUpdate();

            con.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
