package com.edy;

public enum Genre {
  ROMANCE("Romance"),
  COMEDY("Comedy :)"),
  HORROR("HORROR!!!"),
  ACTION("Action!"),
  SCI_FI("Sci-Fi"),
  DRAMA("Drama..."),
  SPORTS("Sports"),
  WESTERN("Western - Howdy Pardner");

  private final String display;

  Genre(String display) {
    this.display = display;
  }

  public String getDisplay() {
    return display;
  }

  @Override
  public String toString() {
    return getDisplay();
  }
}