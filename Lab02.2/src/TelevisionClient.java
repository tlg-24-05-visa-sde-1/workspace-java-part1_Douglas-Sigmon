class TelevisionClient {

  public static void main(String[] args) {
    System.out.println(Television.getInstanceCount() + " instances.");
    System.out.println();

    Television tv1 = new Television();
    tv1.setBrand(ValidBrands.SONY);
    tv1.setVolume(Television.MIN_VOLUME);
    System.out.println(Television.getInstanceCount() + " instances.");
    System.out.println();

    Television tv2 = new Television(ValidBrands.SAMSUNG, Television.MAX_VOLUME);
    System.out.println(Television.getInstanceCount() + " instances.");
    System.out.println();

    Television tv3 = new Television(ValidBrands.TOSHIBA, 45, DisplayType.OLED);
    System.out.println(Television.getInstanceCount() + " instances.");
    System.out.println();

    //tv1
    tv1.turnOn();
    tv1.turnOff();
    System.out.println(tv1);
    System.out.println();

    //tv2
    tv2.turnOn();
    tv2.turnOff();
    System.out.println(tv2);
    System.out.println();

    //tv3
    tv3.turnOn();
    tv3.turnOff();
    System.out.println(tv3);

    System.out.println(Television.getInstanceCount() + " instances.");

  }
}
