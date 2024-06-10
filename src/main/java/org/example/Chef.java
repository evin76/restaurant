package org.example;

public class Chef extends Employee implements EmployeeInterface {
    private static Chef currentChef;

    private Chef(){}

    public static Chef getChef() {
        if (currentChef == null) {
            synchronized (Chef.class) {
                if (currentChef == null) {
                    currentChef = new Chef();
                }
            }
        }
        return currentChef;
    }

    @Override
    public void work() {
        //System.out.println("Cooking and managing cooks");
    }

    @Override
    public void takeOrder(String order) {
        cook(order);
    }

    public void cook(String order) {
        System.out.println("Chef is cooking " + order);
    }
}
