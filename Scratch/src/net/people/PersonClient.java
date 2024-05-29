package net.people;

import java.time.LocalDate;

class PersonClient {

  public static void main(String[] args) {
    Person p1 = new Person("Douglas", LocalDate.of(1989, 10, 6));
    System.out.println(p1);
    System.out.println(p1.age());

    PersonRecord p2 = new PersonRecord("Analaura", LocalDate.of(1997, 4, 19));
    System.out.println(p2.age());
    System.out.println(p2);
  }
}