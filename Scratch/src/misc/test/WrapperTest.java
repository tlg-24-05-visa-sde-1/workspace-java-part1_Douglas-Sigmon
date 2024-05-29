package misc.test;

class WrapperTest {

  public static void main(String[] args) {
    String ageInput = "35";
    int age = Integer.parseInt(ageInput); // takes "35" and turns it into int 35
    Integer ageInteger = Integer.valueOf(ageInput); // returns an Integer with 35 inside;

    String populationInput = "8000000000";
    long population = Long.parseLong(populationInput); // returns primitive long 8_000_000_000
    Long populationLong = Long.valueOf(populationInput);

    String salaryInput = "35.36";
    double salary = Double.parseDouble(salaryInput);
    Double salaryDouble = Double.valueOf(salaryInput);

    String isRainingInput = "true";
    boolean isRaining = Boolean.parseBoolean(isRainingInput);
    Boolean isRainingBoolean = Boolean.valueOf(isRainingInput);

  }
}