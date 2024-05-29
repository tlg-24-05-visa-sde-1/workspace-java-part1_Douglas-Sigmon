package com.edy.client;

import com.edy.Genre;
import com.edy.Movie;
import com.edy.Rating;

class MovieClient {

  public static void main(String[] args) {
    Movie movie1 = new Movie("Twilight");
    movie1.setReleaseYear(2008);
    movie1.setRevenue(5_280_000_000.0);
    movie1.setRating(Rating.PG13);
    movie1.setGenre(Genre.ROMANCE);
    System.out.println(movie1);
    System.out.println();

    Movie movie2 = new Movie("Oppenheimer", 2023, 125.50, Rating.R, Genre.DRAMA);
    System.out.println(movie2);
    System.out.println();

    Movie movie3 = new Movie("Stoopin'", Genre.WESTERN); //sports gambling
    System.out.println(movie3);
  }
}