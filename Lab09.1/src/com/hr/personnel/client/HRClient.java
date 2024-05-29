/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Executive;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

  public static void main(String[] args) {
    // create Department object
    Department dept = new Department("Sales", "Seattle");
    System.out.println(dept);

    // add Employees to it
    dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 35000.00));
    dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 19, 40));

    dept.addEmployee(new SalariedEmployee("Sam", LocalDate.of(2008, 8, 24), 70000.00));
    dept.addEmployee(new HourlyEmployee("Ana", LocalDate.of(2015, 2, 2), 33.65, 80.00));

    dept.addEmployee(new Executive("Douglas", LocalDate.of(2008, 2, 2), 1_500_000.00));

    // list its Employees
    System.out.println("\nList employees:");
    dept.listEmployees();
    System.out.println();

    // make its Employees work
    System.out.println("\nMake employees work:");
    dept.workEmployees();
    System.out.println();

    System.out.println("\nPay employees:");
    dept.payEmployees();
    System.out.println();

    System.out.println("\nHoliday Break:");
    dept.holidayBreak();

  }
}