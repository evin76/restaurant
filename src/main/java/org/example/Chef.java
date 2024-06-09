package org.example;

public class Chef extends Employee implements EmployeeInterface{
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
        System.out.println("Cooking and managing cooks");
    }
}
