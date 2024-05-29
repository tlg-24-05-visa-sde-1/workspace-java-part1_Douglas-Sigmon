package net.people;

//Immutable Class, written in such a way that insances can not have properties changed
//no public methods, getters no setters

import java.time.LocalDate;
import java.time.Period;

class Person {

  private final String name;
  private final LocalDate birthDate;


  public Person(String name, LocalDate birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  /*
   * this method returns the persons age in whole years.
   */
  public int age() {
    return Period.between(birthDate, LocalDate.now()).getYears();
  }

  public String name() {
    return name;
  }

  public LocalDate birthDate() {
    return birthDate;
  }

  @Override
  public String toString() {
    return "net.people.Person{" +
        "name='" + name() + '\'' +
        ", birthDate=" + birthDate() +
        '}';
  }
}