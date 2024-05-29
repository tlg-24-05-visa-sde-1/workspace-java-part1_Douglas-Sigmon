import java.util.Arrays;

class Television {

  //statics
  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;
  private static int instanceCount = 0;
  private ValidBrands validBrands;

  //fields
  private ValidBrands brand = ValidBrands.LG;
  private int volume;
  private boolean isMuted;
  private int oldVolume;
  private DisplayType display = DisplayType.LED;
  private VolumeLevel volumeLevel = VolumeLevel.MEDIUM;

  public Television() {
    instanceCount++;
  }

  public Television(ValidBrands brand) {
    this();
    setBrand(brand);
  }

  //constructors
  public Television(ValidBrands brand, int volume) {
    this(brand);
    setVolume(volume);
  }

  public Television(ValidBrands brand, int volume, DisplayType display) {
    this(brand, volume);
    setDisplay(display);
  }

  //action methods
  private static boolean isValidBrand(ValidBrands brand) {
    ValidBrands[] brands = ValidBrands.values();
    for (ValidBrands brand1 : brands) {
      if (brand1.equals(brand)) {
        return true;
      }
    }
    return false;
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

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
    if (volume == 0) {
      isMuted = true;
    } else {
      isMuted = false;
    }
    return isMuted;
  }

  public ValidBrands getBrand() {
    return brand;
  }

  public void setBrand(ValidBrands brand) {
    if (isValidBrand(brand)) {
      this.brand = brand; // since brand is only set in if statement would it just be null if it doesn't pass validation??
    } else {
      System.out.println(
          "Invalid brand: " + brand + " value of valid brands is " + Arrays.toString(
              ValidBrands.values()));
//            System.out.println(this.brand);
    }
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf("Invalid volume: %s. Must be between %s and %s. \n",
          volume, MIN_VOLUME, MAX_VOLUME);
    } else {
      if (isMuted) {
        mute();
      }
      this.volume = volume;
    }
  }

  public void setVolume(VolumeLevel volumeLevel) {
    this.volumeLevel = volumeLevel;
    setVolume(volumeLevel.getLevel()); // calls overloaded method setVolume(int volume);
  }

  public VolumeLevel getVolumeLevel() {
    return volumeLevel;
  }

  @Override
  public String toString() {
    return String.format("Television: brand = %s, volume = %d display = %s",
        getBrand(), getVolume(), getDisplay());
  }
}

