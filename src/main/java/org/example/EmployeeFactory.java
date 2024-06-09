package org.example;

public class EmployeeFactory {
    public Employee getEmployee (EmployeeType type, String dayOfTheWeek) {
        Employee employee = null;
        switch (type) {
            case COOK:
                employee = new Cook();
                break;
            case WAITER:
                if (!dayOfTheWeek.equals("Friday"))
                    employee = new Waiter();
                else
                    employee = new WaiterReplacement();
                break;
            case MANAGER:
                employee = new Manager();
                break;
            case CHEF:
                employee = Chef.getChef();
                break;
            case BARTENDER:
                employee = new Bartender();
                break;
        }
        return employee;
    }
}
