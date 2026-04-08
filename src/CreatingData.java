// Importing necessary libraries for the CreatingData.java class
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

// Creating Data Class and its methods
public class CreatingData {

    // Main method for CreatingData.java class
public static void main(String[] args) throws SQLException{

//
    Scanner sc = new Scanner(System.in);

    // "Welcoming message" for the system
    System.out.println("\n*** Adding Movie Data ***");
    // Prompting user for Movie's Title
    System.out.print("\nEnter Movie's Title: ");
    String movieName = sc.nextLine();
    // Prompting user for Movie genre data:
    System.out.print("Enter Movie's Genre: ");
    String genre = sc.nextLine();
    // Prompting user for movie's release date:
    System.out.print("Enter Movie's Release Date: ");
    Date ReleaseDate = Date.valueOf(sc.nextLine());

    // Creating a new DataAdmin object (adm)
    DataAdmin adm = new DataAdmin();
    // Passing data to DataAdmin's DataUpload method
    adm.DataUpload(movieName, genre, ReleaseDate);
}
}