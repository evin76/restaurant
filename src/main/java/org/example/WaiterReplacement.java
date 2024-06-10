package org.example;

public class WaiterReplacement extends Waiter implements ManagerInterface {
    @Override
    public void work() {
        attendToCustomers();
    }
}
