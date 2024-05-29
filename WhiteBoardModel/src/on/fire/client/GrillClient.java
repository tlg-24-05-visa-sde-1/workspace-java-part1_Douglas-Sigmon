package on.fire.client;

import on.fire.Grill;
import on.fire.GrillSize;

class GrillClient {

  public static void main(String[] args) {
    Grill g1 = new Grill("Offset Smoker", "Big Bertha", GrillSize.LARGE);
    Grill g2 = new Grill();
    Grill g3 = new Grill("Old Faithful", "Charcoal on.fire.Grill");

    g2.setType("Gas on.fire.Grill");
    g2.setSize(GrillSize.MEDIUM);
    g2.setName("Hanks on.fire.Grill");

    g3.setSize(GrillSize.SMALL);
    g3.setName("Old Faithful");

    g1.cook();
    System.out.println(g1);
    System.out.println();

    g2.cook();
    System.out.println(g2);
    System.out.println();

    g3.cook();
    System.out.println(g3);

    System.out.println(Grill.getID() + " Grills.");
  }
}
