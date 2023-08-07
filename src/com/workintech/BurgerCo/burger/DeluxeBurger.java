package com.workintech.BurgerCo.burger;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;
    public DeluxeBurger() {
        super("Deluxe Burger", "Double", 19.1, "Double Sandwich");
        this.cips = cips;
        this.drink=drink;
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Ekleme yapilamaz.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Ekleme yapilamaz.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Ekleme yapilamaz.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Ekleme yapilamaz.");
    }
}
