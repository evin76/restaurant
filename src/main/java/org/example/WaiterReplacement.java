package org.example;

public class WaiterReplacement extends Waiter implements EmployeeInterface {
    @Override
    public void work() {
        attendToCustomers();
    }
}
