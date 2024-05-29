package edu.wakeup;

/*
 * Main-class focused on testing setter validation logic.
 * Do thorough BVT (Boundary Value Testing) on setSnoozeInterval().
 */
class AlarmClockValidationTest {

  public static void main(String[] args) {
    AlarmClock alarmClock = new AlarmClock();

    alarmClock.setSnoozeInterval(1);
    System.out.println(alarmClock);
    System.out.println();

    alarmClock.setSnoozeInterval(20);
    System.out.println(alarmClock);
    System.out.println();

    alarmClock.setSnoozeInterval(0);
    System.out.println(alarmClock);
    System.out.println();

    alarmClock.setSnoozeInterval(21);
    System.out.println(alarmClock);
    System.out.println();
  }
}