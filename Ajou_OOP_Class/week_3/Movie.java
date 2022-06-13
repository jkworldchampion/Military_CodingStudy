package week_3;

public class Movie {
  private String title;
  private String genre;
  private double rating;
  private int ageLimit;
  
  public Movie(String title, String genre, double rating, int ageLimit){
    this.title = title;
    this.genre = genre;
    this.rating = rating;
    this.ageLimit = ageLimit;
  }
  
  public String getTitle(){
    return this.title;
  }
  public String getGenre(){
    return this.genre;
  }
  public double getRating(){
    return this.rating;
  }
  public int getAgeLimit(){
    return this.ageLimit;
  }
  
  public int compareRating(Movie anothermovie){
    if(this.rating > anothermovie.rating){
      return 1;
    } else if (this.rating.equals(anothermovie.rating)){
      return 0;
    } esle { return -1; }
  }
        
