package pkg;

public class Movie{

    public String movieName;
    public double rating;
    public int numRatings;
    public int revenue;

public Movie(){
    movieName = new String ("Avengers");
    rating = 8.0;
    numRatings = 33;
    revenue = 623357910;
    System.out.println("---------------------------------------------");
    System.out.println("Movie: " + movieName);
    System.out.println("Rating: " + rating);
    System.out.println("Number of Ratings: " + numRatings);
    System.out.println("Revenue: " + revenue);
    System.out.println(" ");
}

public Movie(String l, double n, int o, int p){
    movieName = l;
    rating = n;
    numRatings = o;
    revenue = p;
    System.out.println("Movie: " + movieName);
    System.out.println("Rating: " + rating);
    System.out.println("Number of Ratings: " + numRatings);
    System.out.println("Revenue: " + revenue);
    System.out.println(" ");
}

public String movieToString(){
    this.movieName = movieName;
    return movieName;
}

public String getMovieName(){
    this.movieName = movieName;
    return movieName;
}
public int getRevenue(){
    return revenue;
}

public double addRating(double z){
    double rating = (rating + z/2.0);
    return rating;
    
}
}
