package org.example;

public class Waiter extends Employee implements EmployeeInterface {

    private Chef chef = Chef.getChef();

    private EmployeeInterface currentlyCookingEmployee;

    public void assignOrder(EmployeeInterface currentlyCookingEmployee, String order) {
        this.currentlyCookingEmployee = currentlyCookingEmployee;
        giveOrderToRandomCook(currentlyCookingEmployee, order);
    }

    public void giveOrderToRandomCook(EmployeeInterface currentlyCookingEmployee, String order) {
        currentlyCookingEmployee.takeOrder(order);
    }

    public Employee getRandomCook(Restaurant restaurant) {
        Employee[] cooks = new Employee[] {restaurant.getCook1(), restaurant.getCook2(), restaurant.getCook3(), restaurant.getChef()};
        int randomCook = (int)(Math.random() * cooks.length);
        return cooks[randomCook];
    }

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
