package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee {

  private double rate;
  private double hours;

  public HourlyEmployee() {
  }


  public HourlyEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }

  public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
    this(name, hireDate);
    setRate(rate);
    setHours(hours);
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  //action methods
  @Override
  public void pay() {
    System.out.printf(getName() + " is paid hourly $%.2f \n", (getRate() * getHours()));
  }

  @Override
  public void payTaxes() {
    System.out.printf("%s is pays taxes of $%.2f\n", getName(),
        getRate() * getHours() * HOURLY_TAX_RATE);
  }

  @Override
  public String toString() {
    return String.format(super.toString() + ", rate: %.2f, hours: %.2f \n", rate, hours);
  }
}