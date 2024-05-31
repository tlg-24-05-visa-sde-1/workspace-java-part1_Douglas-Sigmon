/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 * <p>
 * Properties: String name String location Employee[] employees  the Employees in this department.
 * int currentIndex      internal counter for number of employees in the department.
 * <p>
 * Methods (excluding get/set methods): void listEmployees()  print info on all employees in the
 * department. void workEmployees()  make all employees in the department work. String toString()
 * self-explanatory.
 */
public class Department {

  // fields
  private String name;
  private String location;
  private final Collection<Employee> employees = new ArrayList<>();

  // constructors
  public Department() {
  }

  public Department(String name, String location) {
    setName(name);
    setLocation(location);
  }

  // business methods
  public void listEmployees() {
    for (Employee employee : employees) {
      System.out.println(employee);
    }
  }

  public void workEmployees() {
    for(Employee employee: employees) {
      employee.work();
    }
  }

  public void payEmployees() {
    for(Employee employee: employees) {
      employee.pay();
    }
  }

  /*
   * For all employees that take vacation, make them do that
   * Salaried employees only
   */
  public void holidayBreak() {
    for (Employee employee : employees) {
      // ask each reference if it is SalariedEmployee object,
      // "downcast" the Employee reference to more specific SalariedEmployee
      // then we can call salaried employee specific methods i.e takeVacation()
      if (employee instanceof SalariedEmployee) {
        ((SalariedEmployee) employee).takeVacation();
      }
    }
  }

  // helper method to add an Employee to the array
  public void addEmployee(Employee emp) {
    employees.add(emp);
  }

  // accessor methods
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + ": name=" + getName() + ", location=" + getLocation();
  }
}