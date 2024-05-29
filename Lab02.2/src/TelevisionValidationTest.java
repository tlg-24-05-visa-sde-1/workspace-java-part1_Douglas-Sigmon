class TelevisionValidationTest {
  public static void main(String[] args) {
    Television tv = new Television();
    tv.setVolume(0);
    System.out.println(tv);
    System.out.println();

    tv.setVolume(100);
    System.out.println(tv);
    System.out.println();

    tv.setVolume(-1);
    System.out.println(tv);
    System.out.println();

    tv.setVolume(101);
    System.out.println(tv);
    System.out.println();

    Television tv1 = new Television(ValidBrands.SAMSUNG, -1);
    System.out.println(tv1);
    System.out.println();

    tv.setBrand(ValidBrands.SAMSUNG);
    tv.setVolume(VolumeLevel.MEDIUM);
    System.out.println(tv);
    tv.setBrand(ValidBrands.TOSHIBA);
    tv.setVolume(VolumeLevel.OFF);
    System.out.println(tv);
    tv.setBrand(ValidBrands.LG);
    tv.setVolume(VolumeLevel.LOUD);
    System.out.println(tv);
    tv.setBrand(ValidBrands.SONY);
    tv.setVolume(VolumeLevel.SOFT);
    System.out.println(tv);

  }
}