package com.entertainment;

import java.util.Arrays;

public class Television {

  //statics
  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;
  private static int instanceCount = 0;
  public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

  private static boolean isValidBrand(String brand) {
    for (String b : VALID_BRANDS) {
      if (b.equals(brand)) {
        return true;
      }
    }
    return false;
  }


  public static int getInstanceCount() {
    return instanceCount;
  }

  //fields
  private String brand = "LG";
  private int volume;
  private boolean isMuted;
  private int oldVolume;
  private DisplayType display = DisplayType.LED;

  //constructors

  public Television() {
    instanceCount++;
  }

  public Television(String brand) {
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);
  }

  public Television(String brand, int volume, DisplayType display) {
    this(brand, volume);
    setDisplay(display);
  }

  //action methods
  public void turnOn() {
    boolean isConneced = verifyInternetConnection();
    System.out.println("Turning on your " + brand + " TV.");
    System.out.println("Volume is " + volume);
  }

  public void turnOff() {
    System.out.println("Turning off " + brand + " TV. Goodbye!");

  }

  public void mute() {
    if (!isMuted) { //not currently muted
      oldVolume = volume;
      volume = MIN_VOLUME;
      isMuted = true;
    } else { //currently muted
      volume = oldVolume;
      isMuted = false;
    }
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  //accessor methods
  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  public boolean isMuted() {
    return isMuted;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    if (isValidBrand(brand)) {
      this.brand = brand; // since brand is only set in if statement would it just be null if it doesn't pass validation??
    } else {
      System.out.println(
          "Invalid brand: " + brand + " value of valid brands is " + Arrays.toString(VALID_BRANDS));
//            System.out.println(this.brand);
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
//            System.out.println("Invalid Volume: " + volume + ", Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
      System.out.printf("Invalid volume: %s. Must be between %s and %s. \n",
          volume, MIN_VOLUME, MAX_VOLUME);
    } else {
      if (isMuted) {
        mute();
      }
      this.volume = volume;
    }
  }

  @Override
  public String toString() {
//        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
//        return "Television{" + "InstanceCount=" + instanceCount +
//                "brand='" + getBrand() + '\'' +
//                ", volume=" + volumeString + '}' +
//                " display=" + getDisplay() + '}';
    return String.format("Television: brand = %s, volume = %d display = %s", getBrand(),
        getVolume(), getDisplay());
  }
}
