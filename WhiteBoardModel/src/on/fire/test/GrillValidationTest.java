package on.fire.test;

import on.fire.Grill;
import on.fire.GrillSize;

class GrillValidationTest {

  public static void main(String[] args) {
    //Correct Grills
    Grill g = new Grill("Grill-1", "Gas", GrillSize.LARGE);
    System.out.println(g);

    Grill g2 = new Grill("Grill-2", "Charcoal", GrillSize.SMALL);
    System.out.println(g2);

    Grill g3 = new Grill("Grill-3");
    System.out.println(g3);

    Grill g4 = new Grill("Doug's Grill", "Gas");
    System.out.println(g4);

    //should reject type of grill and print size as medium
    Grill g5 = new Grill("Grill-5", "not on list");
    System.out.println(g5);
  }
}