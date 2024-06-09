package org.example;

public class Restaurant {
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
}
