package org.example;

public class EmployeeFactory {
    private int numberOfCooksWorking;

    public Employee getEmployee (Restaurant restaurant, EmployeeType type, String dayOfTheWeek) {
        this.numberOfCooksWorking = restaurant.numberOfCooks();
        Cook[] cooks = new Cook[] {restaurant.getCook1(), restaurant.getCook2(), restaurant.getCook3()};
        int randomCook = (int)(Math.random() * numberOfCooksWorking);
        Employee employee = null;
        switch (type) {
            case COOK:
                employee = cooks[randomCook];
                break;
            case WAITER:
                if (!dayOfTheWeek.equals("Friday"))
                    employee = restaurant.getWaiter();
                else
                    employee = new WaiterReplacement();
                break;
            case MANAGER:
                employee = restaurant.getManager();
                break;
            case CHEF:
                employee = restaurant.getChef();
                break;
            case BARTENDER:
                employee = restaurant.getBartender();
                break;
        }
        return employee;
    }
}
