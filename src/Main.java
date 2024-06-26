import screenmatch.model.Movie;
import screenmatch.model.Series;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setTitle("The Godfather");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationMinutes(180);

        myMovie.showInfo();
        myMovie.rankMovie(8);
        myMovie.rankMovie(5);
        myMovie.rankMovie(10);

        System.out.println(myMovie.getRating());
        System.out.println(myMovie.getRatingCount());
        System.out.println(myMovie.getAverage());

        Series mySeries = new Series();
        mySeries.setTitle("Lost");
        mySeries.setReleaseYear(2004);
        mySeries.showInfo();
        mySeries.setSeasons(10);
        mySeries.setEpsiodesPerSeason(10);
    }
}