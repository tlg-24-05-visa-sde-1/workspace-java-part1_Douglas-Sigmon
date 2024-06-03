package edu.geometry;

public class Circle implements Shape {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }


  public double getRadius() {
    return radius;
  }

  @Override
  public double getArea() {
    return Math.PI*Math.pow(getRadius(), 2);
  }

  @Override
  public double getPerimeter() {
    return 2*Math.PI*getRadius();
  }

  @Override
  public String toString() {
    return "Circle{" +
        "radius=" + getRadius() +
        '}';
  }
}