package org.example;

public class Main {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Customer customer = new Customer();
        Waiter waiter = (Waiter) customer.callForAnEmployee(restaurant, EmployeeType.WAITER, "Monday");
        String order = customer.order();
        waiter.assignOrder((EmployeeInterface) waiter.getRandomCook(restaurant), order);
    }
}