// Importing necessary libraries for the DataAdmin.java class
import java.sql.*;

// DataAdmin class (Administrative methods to the system's database)
public class DataAdmin {

    // DataUpload Method (uploads )
    public void DataUpload(String movieName, String genre, Date releaseDate) throws SQLException {

        // Creating a new object for DBConnectionManager
        DBConnectionManager dbcm = new DBConnectionManager();

        // SQL query to insert data into specified database table (movies table)
        String DataCreateQuery = "INSERT INTO movies (Title, Genre, Release_Date) VALUES (?, ?, ?)";

        // Try-Catch block of code
        try(Connection connection = DBConnectionManager.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(DataCreateQuery);){
            // Parameters which insert data into database (Data provided by user in CreatingData.java class)
            pstmt.setString(1, movieName);
            pstmt.setString(2, genre);
            Date ReleaseDate = null;
            pstmt.setDate(3,ReleaseDate);

            // Syntax to execute inserting data into the database
            int rowsAffected = pstmt.executeUpdate();

            // Should movie data be added into the database, a message will appear
            if(rowsAffected>0){
                System.out.println("Data has been uploaded successfully");
            }
        }
        // Catch block to return SQL-related exception message(s)
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}