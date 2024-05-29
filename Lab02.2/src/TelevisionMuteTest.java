class TelevisionMuteTest {

  public static void main(String[] args) {
    Television tv = new Television(ValidBrands.SAMSUNG, 32);
    tv.mute();
    System.out.println(tv);
    System.out.println();

    tv.mute();
    System.out.println(tv);
    System.out.println();

    tv.mute();
    System.out.println(tv);
    System.out.println();

    tv.setVolume(50);
    System.out.println(tv);
  }
}