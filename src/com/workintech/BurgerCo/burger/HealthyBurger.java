package com.workintech.BurgerCo.burger;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name,healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, price, breadRollType);
        setMeat("Tofu");
    }
    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name,double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }

        if (healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }

        System.out.println("Total price is " + totalPrice);
        return totalPrice;
    }
}
