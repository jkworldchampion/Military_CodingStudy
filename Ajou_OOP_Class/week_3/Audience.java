package week_3;

public class Audience {
  private String name;
  private int age;
  private String favoriteGenre;
  
  public Audience(String name, int age, String favoriteGenre){
    this.name = name;
    this.age = age;
    this.favoriteGenre = favoriteGenre;
  }
  
  public String getName(){
    return this.name;
  }
  public int getAge(){
    return this.age;
  }
  public String getFavoriteGenre(){
    return this.favoriteGenre;
  }
  
  public boolean canWatch(Movie movie){
    if (this.age < movie.getAgeLimit()){
      return false;
    } else { return true; }
  }
  
  public boolean isFavorite(Movie movie){
    if (this.getFavoriteGenre() == Movie.getGenre()){
      return true;
    } else { return false; }
  }
