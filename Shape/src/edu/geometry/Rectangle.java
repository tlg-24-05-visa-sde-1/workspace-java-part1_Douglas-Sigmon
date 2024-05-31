package edu.geometry;

public class Rectangle implements Shape {
  private final double width;
  private final double height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }


  public double getWidth() {
    return width;
  }

  public double getHeight() {
    return height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getPerimeter() {
    return (2*width)+(2*height);
  }

  @Override
  public String toString() {
    return "Rectangle{" +
        "width=" + getWidth() +
        ", height=" + getHeight() +
        '}';
  }
}