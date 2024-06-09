package org.example;

public class Manager extends Employee implements EmployeeInterface{

    @Override
    public void work() {
        System.out.println("Managing restaurant");
    }
}
