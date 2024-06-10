package org.example;

public class Customer {
    private final EmployeeFactory employeeFactory;

    public Customer () {
        this.employeeFactory = new EmployeeFactory();
    }

    public Employee callForAnEmployee (Restaurant restaurant, EmployeeType type, String dayOfTheWeek) {
        Employee employee = employeeFactory.getEmployee(restaurant, type, dayOfTheWeek);
        System.out.println("I need a " + getEmployeeTypeString(type));
        if (employee instanceof WaiterReplacement)
            ((WaiterReplacement) employee).work();
        else if (employee instanceof Waiter)
            ((Waiter) employee).attendToCustomers();
        return employee;
    }

    private String getEmployeeTypeString (EmployeeType type) {
        String employeeType = "";
        switch (type) {
            case COOK:
                employeeType = "cook";
                break;
            case WAITER:
                employeeType = "waiter";
                break;
            case MANAGER:
                employeeType = "manager";
                break;
            case CHEF:
                employeeType = "chef";
                break;
            case BARTENDER:
                employeeType = "bartender";
                break;
        }
        return employeeType;
    }

    public String order() {
        String[] menu = getMenu();
        int randomDish = (int)(Math.random() * menu.length);
        String dish = menu[randomDish];
        System.out.println("I want " + dish);
        return dish;
    }

    public String[] getMenu() {
        String[] menu = new String[] {"steak", "spaghetti", "pizza", "soup"};
        return menu;
    }
}
