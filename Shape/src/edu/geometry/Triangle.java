package edu.geometry;

public class Triangle implements Shape {
  private final double side1;
  private final double side2;
  private final double angle;
//  private final double side3;

  public Triangle(double side1, double side2, double angle) {
    this.side1 = side1;
    this.side2 = side2;
    this.angle = angle;
  }

  public double getSide1() {
    return side1;
  }

  public double getSide2() {
    return side2;
  }

  public double getAngle() {
    return angle;
  }

  @Override
  public double getArea() {
    return 1/2.0*getSide1()*getSide2()*Math.sin(Math.toRadians(getAngle()));
  }

  @Override
  public double getPerimeter() {
    double side3 = Math.sqrt ((Math.pow(side1, 2) + Math.pow(side2, 2)));
    return side1+side2+side3;
  }

  @Override
  public String toString() {
    return "Triangle{" +
        "side1=" + getSide1() +
        ", side2=" + getSide2() +
        ", angle=" + getAngle() +
        '}';
  }
}