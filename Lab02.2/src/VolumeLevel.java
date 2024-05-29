//1. Create an "advanced" enum named VolumeLevel, with 5 volume presets: OFF, SOFT, MEDIUM, LOUD, MAX.
//See Java Part 1 Sessions manual p.129 for an example.
//
//Each preset carries an int value which represents the actual volume value:
//    0, 25, 50, 75, 100, respectively

enum VolumeLevel {
  OFF(0),
  SOFT(25),
  MEDIUM(50),
  LOUD(75),
  MAX(100);

  private final int level;

  VolumeLevel(int level) {
    this.level = level;
  }

  public int getLevel() {
    return level;
  }



}