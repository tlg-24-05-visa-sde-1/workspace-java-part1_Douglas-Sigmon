package on.fire.client;

import java.util.Arrays;
import on.fire.Grill;
import on.fire.GrillSize;

class GrillClientArgs {

  public static void main(String[] args) {
    if (args.length < 3) {
      String usage = "Usage: java on.fire.client.GrillClientArgs <name>, <type>, <isCharcoal>, <size>";
      String example = "Example: java on.fire.client.GrillClientArgs Big Bertha, Offset Smoker, true, LARGE";
      String note = "Note: " +
          "\n available sizes are " + Arrays.toString(GrillSize.values()) +
          "\n available types are " + Arrays.toString(
          Grill.VALID_TYPES); //I know it should be and enum Jay, don't kill me! just doing for practice
      System.out.println(usage);
      System.out.println(example);
      System.out.println(note);
      return;
    }
    String name = args[0];
    String type = args[1];
    GrillSize size = GrillSize.valueOf(args[2].toUpperCase());

    Grill grill = new Grill(name, type, size);
    System.out.println("Congratulations on your new grill! See Details here: " + grill);

  }


}