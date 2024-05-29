package misc.test;

import java.util.Arrays;

class ArraysTest {

  public static void main(String[] args) {
    int[] ages = new int[4];
    ages[0] = 57;
    ages[1] = 50;
    ages[2] = 10;
    ages[3] = 10;
    System.out.println(Arrays.toString(ages));
    for (int age : ages) {
      System.out.println("The age is: " + age);
    }
    System.out.println();

    double[] sizes = {1.0, 2.4, 3.7, 4.2, 5.9};
    System.out.println(Arrays.toString(sizes));
    System.out.println();

    boolean[] statuses = {false, true, false, true, true};
    System.out.println(Arrays.toString(statuses));
    System.out.println();

    String[] names = {"Douglas", "Ana", "Meshell", "Sam"};
    System.out.println(Arrays.toString(names));
    for (int i = 0; i < names.length; i++) {
      System.out.println("The name is: " + names[i]);
    }
  }
}