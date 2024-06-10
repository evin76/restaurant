package org.example;

public class Restaurant {
    private final int numberOfCooksWorking = 3;
    private  Cook cook1;
    private  Cook cook2;
    private  Cook cook3;
    private  Chef chef;
    private  Manager manager;
    private  Waiter waiter;
    private  Bartender bartender;

    public void openRestaurant () {
        cook1.work();
        cook2.work();
        cook3.work();
        chef.work();
        manager.work();
        waiter.work();
        bartender.work();
    }

    public Restaurant () {
        this.cook1 = new Cook();
        this.cook2 = new Cook();
        this.cook3 = new Cook();
        this.chef = Chef.getChef();
        this.manager = new Manager();
        this.waiter = new Waiter();
        this.bartender = new Bartender();
    }

    public Cook getCook1() {
        return cook1;
    }

    public Cook getCook2() {
        return cook2;
    }

    public Cook getCook3() {
        return cook3;
    }

    public Chef getChef() {
        return chef;
    }

    public Manager getManager() {
        return manager;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public Bartender getBartender() {
        return bartender;
    }

    public int numberOfCooks() {
        return numberOfCooksWorking;
    }
}
