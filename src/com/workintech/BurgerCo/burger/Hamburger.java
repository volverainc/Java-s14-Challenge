package com.workintech.BurgerCo.burger;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private BreadRollType breadRollType;

    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price,addition2Price,addition3Price,addition4Price;

    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        this.price = price;
        BreadRollType BreadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, double price, BreadRollType breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        BreadRollType BreadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;

        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);

        if (addition1Name != null) {
            totalPrice += addition1Price;
            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
        }

        if (addition2Name != null) {
            totalPrice += addition2Price;
            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
        }

        if (addition3Name != null) {
            totalPrice += addition3Price;
            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
        }

        if (addition4Name != null) {
            totalPrice += addition4Price;
            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
        }

        System.out.println("Total price is " + totalPrice);
        return totalPrice;
    }

}
