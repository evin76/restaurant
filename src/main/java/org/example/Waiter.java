package org.example;

public class Waiter extends Employee implements EmployeeInterface {

    private Chef chef = Chef.getChef();

    public void attendToCustomers () {
        System.out.println("What do you wish to order today?");
    }

    @Override
    public void work() {
        //System.out.println("Waiting for orders");
    }

    @Override
    public void takeOrder(String order) {
        chef.takeOrder(order);
    }

}
