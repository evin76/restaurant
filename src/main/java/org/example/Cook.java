package org.example;

public class Cook extends Employee implements EmployeeInterface{

    @Override
    public void work() {
        //System.out.println("Cooking");
    }

    @Override
    public void takeOrder(String order) {

    }
}
