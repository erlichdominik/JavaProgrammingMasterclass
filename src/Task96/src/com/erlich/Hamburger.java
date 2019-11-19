package com.erlich;

public class Hamburger  {
    private String breadRollType;
    private boolean isMeat;
    private boolean isCarrot;
    private boolean isLettuce;
    private boolean isTomato;
    private boolean isCucumber;
    public double price = 3.0;
    private String name;

    public Hamburger(String breadRollType, boolean isMeat, double price, String name) {
        this.breadRollType = breadRollType;
        this.isMeat = isMeat;
        this.price = price;
        this.name = name;
    }

    public void addCarrot() {
        this.isCarrot = true;
        price += 0.50;
    }

    public void addLettuce() {
        this.isLettuce = true;
        price += 0.40;
    }

    public void addCTomato() {
        this.isTomato = true;
        price += 0.60;
    }

    public void addCucumber() {
        this.isCucumber = true;
        price += 0.20;
    }

    public boolean isCarrot() {
        return isCarrot;
    }

    public boolean isLettuce() {
        return isLettuce;
    }

    public boolean isTomato() {
        return isTomato;
    }

    public boolean isCucumber() {
        return isCucumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void showBurger() {
        System.out.println("Name of the burger "     + getName());
        System.out.println("Price of the burger: " + this.price);
        System.out.println("Inlucde luttace " + isLettuce());
        System.out.println("Inlucde carrot " + isCarrot());
        System.out.println("Inlucde cucumber " + isCucumber());
        System.out.println("Inlucde tomato " + isTomato());
    }
}
