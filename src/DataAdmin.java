//
import java.sql.*;

//
public class DataAdmin {

    //
    public void DataUpload(String movieName, String genre, Date releaseDate) throws SQLException {

        DBConnectionManager dbcm = new DBConnectionManager();

        //SQL query to insert data into specified database table (movies table)
        String DataCreateQuery = "INSERT INTO movies (Title, Genre, Release_Date) VALUES (?, ?, ?)";

        //
        try(Connection connection = DBConnectionManager.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(DataCreateQuery);){

            //
            pstmt.setString(1, movieName);
            pstmt.setString(2, genre);
            Date ReleaseDate = null;
            pstmt.setDate(3,ReleaseDate);

            int rowsAffected = pstmt.executeUpdate();

            //
            if(rowsAffected>0){
                System.out.println("Data has been uploaded successfully");
            }
        }
        //
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}