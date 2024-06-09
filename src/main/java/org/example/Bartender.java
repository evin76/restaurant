package org.example;

public class Bartender extends Employee implements EmployeeInterface{
    @Override
    public void work() {
        System.out.println("Making drinks");
    }
}
