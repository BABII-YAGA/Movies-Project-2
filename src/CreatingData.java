// Importing necessary libraries for the CreatingData.java class
import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

// Main method
public class CreatingData {

public static void main(String[] args) throws SQLException{

//
    Scanner sc = new Scanner(System.in);


    //
    System.out.println("\n*** Adding Movie Data ***");
    //
    System.out.print("\nEnter Movie's Title: ");
    String movieName = sc.nextLine();
    //
    System.out.print("Enter Movie's Genre: ");
    String genre = sc.nextLine();
    //
    System.out.print("Enter Movie's Release Date: ");
    Date ReleaseDate = Date.valueOf(sc.nextLine());
    //
    DataAdmin adm = new DataAdmin();
    adm.DataUpload(movieName, genre, ReleaseDate);



}
}
