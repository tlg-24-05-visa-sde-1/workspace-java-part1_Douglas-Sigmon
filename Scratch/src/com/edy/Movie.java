package com.edy;

public class Movie {

  //instance variables or fields
  private String title;
  private Integer releaseYear;
  private Double revenue;
  private Rating rating;
  private Genre genre;

  //constructors get called when client says "new"
  public Movie(String title) {
    setTitle(title);
  }

  public Movie(String title, Genre genre) {
    this(title);
    this.genre = genre;
  }

  public Movie(String title, Integer releaseYear, Double revenue) {
    this(title);                    //delegate to ctor above which handles title
    setReleaseYear(releaseYear);    // delegate to setters for any validation/conversion
    setRevenue(revenue);
  }

  public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
    this(title, releaseYear, revenue);
    this.rating = rating;
    this.genre = genre;
  }

  //"action" methods - play(), pause(), stop(), rewind(), fastForward()

  //"accessor" methods, aka get/set methods, aka getters-and-setters


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Integer getReleaseYear() {
    return releaseYear;
  }

  public void setReleaseYear(Integer releaseYear) {
    this.releaseYear = releaseYear;
  }

  public Double getRevenue() {
    return revenue;
  }

  public void setRevenue(Double revenue) {
    this.revenue = revenue;
  }

  public Rating getRating() {
    return rating;
  }

  public void setRating(Rating rating) {
    this.rating = rating;
  }

  public Genre getGenre() {
    return genre;
  }

  public void setGenre(Genre genre) {
    this.genre = genre;
  }

  @Override
  public String toString() {
    return String.format(
        "com.edy.Movie: title=%s, releaseYear=%s, revenue=%,.2f, rating=%s, genre=%s \n",
        getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());
//        return "com.edy.Movie{" +
//                "title='" + getTitle() + '\'' +
//                ", releaseYear=" + getReleaseYear() +
//                ", revenue=" + getRevenue() +
//                ", rating=" + getRating() +
//                ", genre=" + getGenre() +
//                '}';
  }
}