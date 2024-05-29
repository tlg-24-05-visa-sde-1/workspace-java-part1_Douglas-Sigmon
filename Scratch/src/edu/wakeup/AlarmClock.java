package edu.wakeup;

/*
 * Class definition to model the workings of an Alarm Clock
 * This is sometimes called a "Business Class" or "System Class"
 * Has NO main() method - classes like these dont.
 */
class AlarmClock {

  // class ("static") variables
  // There is only one copy of these, they live up in that "shared" area, NOT in each object
  public static final int MIN_INTERVAL = 1;
  public static final int MAX_INTERVAL = 20;

  //properties or attributes - called "fields" or "instance variables"
  private int snoozeInterval = 5; // default value when client doesnt specify (instead of 0)


  //constructors - like "methods" that get called when clients say "new"
  public AlarmClock() {

  }

  public AlarmClock(int snoozeInterval) {
    setSnoozeInterval(snoozeInterval);
  }


  //functions or behaviors - called "methods" in Java
  public void snooze() {
    System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
  }

  // "accessor" method - provide "controlled access" to the objects fields.
  public int getSnoozeInterval() {
    return snoozeInterval;
  }

  public void setSnoozeInterval(int snoozeInterval) {
    if (snoozeInterval >= MIN_INTERVAL && snoozeInterval <= MAX_INTERVAL) {
      this.snoozeInterval = snoozeInterval;
    } else {
      System.out.println("Invalid snoozeInterval: " + snoozeInterval +
          ". Must choose between " + MIN_INTERVAL + " and " + MAX_INTERVAL + " (inclusive).");
    }

  }

  @Override
  public String toString() {
    return "edu.wakeup.AlarmClock{" +
        "snoozeInterval=" + getSnoozeInterval() +
        '}';
  }
}