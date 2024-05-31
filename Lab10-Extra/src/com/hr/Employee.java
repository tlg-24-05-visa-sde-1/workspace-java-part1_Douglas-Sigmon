package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    // Diff way to catch exceptions
//    public void goToWork() {
//        Car car = new Car("123ABC", "Mazda", "Protege");
//
//        try {
//            car.start();
//            car.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e.getMessage()); //toString automatically called.
//        } finally {
//            car.stop();
//        }
//    }

    // Diff way to catch exceptions
//    public void goToWork() {
//        Car car = new Car("123ABC", "Mazda", "Protege");
//
//        try {
//            car.start();
//            car.moveTo("West Seattle");
//        } catch (DestinationUnreachableException e) {
//            System.out.println(e.getMessage()); //toString automatically called.
//        } finally {
//            car.stop();
//        }
//    }
    public void goToWork() throws WorkException {
        Car car = new Car("123ABC", "Mazda", "Protege");

        try {
            car.start();
            car.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work",e);
        } finally {
            car.stop();
        }
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}