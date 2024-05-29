package on.fire;

public class Grill {

  public static final String[] VALID_TYPES = {"Offset-Smoker", "Gas", "Charcoal",
      "Flat-Top"}; // I know jay ENUMS!, just doing to practice
  public static int ID;
  private String name;
  private String type;
  private GrillSize size = GrillSize.MEDIUM; //constraints small, medium, large, XL

  //ctor
  public Grill() {
    ID++;
  }

  public Grill(String name) {
    this();
    setName(name);
  }

  public Grill(String name, String type) {
    this(name);
    setType(type);
  }

  public Grill(String name, String type, GrillSize size) {
    this(name, type);
    setSize(size);
  }

  // methods
  private static boolean isValidType(String type) {
    boolean valid = false;
    for (String t : VALID_TYPES) {
      if (t.equals(type)) {
        valid = true;
        break;
      }
    }
    return valid;
  }

  public static int getID() {
    return ID;
  }

  private void preheat() {
    System.out.println("on.fire.Grill is heating up");
  }

  public void cook() {
    System.out.println("Delicious food is on the way");
  }

  void addFuel() {
    System.out.println("on.fire.Grill is adding fuel");
  }

  //accessor methods
  public GrillSize getSize() {
    return size;
  }

  public void setSize(GrillSize size) {
    this.size = size;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    if (isValidType(type)) {
      this.type = type;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "on.fire.Grill{" +
        "id='" + ID + '\'' +
        "name='" + getName() + '\'' +
        ", type='" + getType() + '\'' +
        ", size=" + getSize() +
        '}';
  }

}
