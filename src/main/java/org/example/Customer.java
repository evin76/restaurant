package org.example;

public class Customer {
    private final EmployeeFactory employeeFactory;

    public Customer (EmployeeFactory employeeFactory) {
        this.employeeFactory = employeeFactory;
    }

    public Employee callForAnEmployee (EmployeeType type, String dayOfTheWeek) {
        Employee employee = employeeFactory.getEmployee(type, dayOfTheWeek);
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
        }
        return employeeType;
    }
}
