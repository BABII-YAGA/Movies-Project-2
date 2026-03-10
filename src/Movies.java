import java.sql.Date;

public class Movies {

    private String title;
    private String genre;
    private Date ReleaseDate;

    public Movies(String movieName, String genre, Date ReleaseDate) {
        this.title = movieName;
        this.genre = genre;
        this.ReleaseDate = ReleaseDate;
    }

    public String getTitle() {return title;}
    public String getGenre() {return genre;}
    public Date getReleaseDate() {return ReleaseDate;}

}
