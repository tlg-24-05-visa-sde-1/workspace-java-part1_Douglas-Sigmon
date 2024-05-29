package on.fire;

public enum GrillSize {
  SMALL("Small"),
  MEDIUM("Medium"),
  LARGE("Large"),
  XLARGE("XLarge");

  private final String display;

  GrillSize(String display) {
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