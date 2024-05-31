package misc.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {

  public static void main(String[] args) {
    Map<String, Double> gpaMap = new HashMap<>();
    gpaMap.put("breana", 3.6);
    gpaMap.put("douglas", 1.87);
    gpaMap.put("amir", 3.8);
    gpaMap.put("tayo", 3.4);
    gpaMap.put("daiyron", 3.7);
    gpaMap.put("coty", 1.6);
    dump(gpaMap);
    System.out.println();

    //print all gpa's that are 3.5 or greater
    Collection<Double> gpaValues = gpaMap.values();
    System.out.println();

    for (Double gpa : gpaValues) {
      if (gpa >= 3.5) {
        System.out.println(gpa);
      }
    }
    System.out.println();
    //print the names >=2.0
    for(var entry : gpaMap.keySet()) {
      if(gpaMap.get(entry) >= 2.0) {
        System.out.println(entry + ": " + gpaMap.get(entry)); ;
      }
    }
  }
  private static void dump(Map<String, Double> map) {
    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + " | " + entry.getValue());
    }
  }
}