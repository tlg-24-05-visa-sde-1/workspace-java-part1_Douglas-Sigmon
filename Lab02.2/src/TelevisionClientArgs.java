/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.util.Arrays;

/**
 * Intended usage (by human): $ java TelevisionClientArgs <brand> <volume> <display>
 * <p>
 * Example: $ java TelevisionClientArgs Samsung 32 PLASMA
 * <p>
 * GOAL: Create an instance of Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs {

  public static void main(String[] args) {
    // must first check for the presence of your (required) 3 arguments
    if (args.length < 3) {
      String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
      String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
      String note = "Note: " +
          "\n available brands are " + Arrays.toString(ValidBrands.values()) +
          "\n Volume must be " + Television.MIN_VOLUME + " to " + Television.MAX_VOLUME +
          "\n supported displays include " + Arrays.toString(DisplayType.values());
      System.out.println(usage);
      System.out.println(example);
      System.out.println(note);
      return;  // early return from main(), application exits
    }

    // at this point, you can safely proceed, because you got your arguments
    // first, let's just show that we got them
    //Step 1: convert from string into proper types, as necessary
    ValidBrands brand = ValidBrands.valueOf(args[0]);
    int volume = Integer.parseInt(args[1]);
    DisplayType display = DisplayType.valueOf(args[2]);

    //Step 2: Create a Television object from 3 values
    Television tv = new Television(brand, volume, display);

    //Step 3: congratulate them on their order, pring the resulting Television
    System.out.println("congratulations on your new tv! See details here: " + tv);


  }
}