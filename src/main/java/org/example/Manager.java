package org.example;

public class Manager extends Employee implements ManagerInterface {

    @Override
    public void work() {
        System.out.println("Managing restaurant");
    }
}
