package edu.wakeup;

/*
 * Client-side "main-class" (class definition with the main() method.
 * It will create a few instances of edu.wakeup.AlarmClock, and give them a basic test drive.
 */
class AlarmClockClient {

  public static void main(String[] args) {
    // creates edu.wakeup.AlarmClock object and set its properties.
    AlarmClock a1 = new AlarmClock();
    a1.setSnoozeInterval(7);

    // create a second instance and set its properties, also
    AlarmClock a2 = new AlarmClock();
    a2.setSnoozeInterval(AlarmClock.MAX_INTERVAL);

    //create a third instance BUT this time dont set its properties
    AlarmClock a3 = new AlarmClock();

    //make them snooze
    a1.snooze();
    a2.snooze();
    a3.snooze();
    System.out.println();

    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);

  }
}