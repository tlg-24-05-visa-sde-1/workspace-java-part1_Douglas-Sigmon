package org.math;

class CalcClient {

  public static void main(String[] args) {

    double a = 8.7;
    double b = 3.5;
    double addResult = Calculator.add(a, b);
    double subResult = Calculator.subtract(a, b);

    System.out.println("sum is : " + addResult);
    System.out.println("sub is : " + subResult);

    boolean result = Calculator.isEven(9);
    System.out.println("Result is : " + result);

    System.out.println(Calculator.randomInt());

    System.out.println(Calculator.randomInt(7, 26));

    System.out.println(Calculator.avg(3, 5, 10, 13));
  }
}