package edu.geometry.client;

import edu.geometry.Circle;
import edu.geometry.Rectangle;
import edu.geometry.Shape;
import edu.geometry.Triangle;

class ShapeClient {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(3.7);
    shapes[1] = new Rectangle(2.7, 4.5);
    shapes[2] = new Triangle(3.4,7.8,3);

    for (Shape shape : shapes) {
      System.out.println(shape);
      System.out.println("Area is: " + shape.getArea());
      System.out.println("Perimeter is: " +shape.getPerimeter());
      System.out.println();
    }

  }

}