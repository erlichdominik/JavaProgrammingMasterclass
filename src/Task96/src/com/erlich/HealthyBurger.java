package com.erlich;

public class HealthyBurger extends Hamburger {
    private boolean isCheese;
    private boolean isPinapple;

    public HealthyBurger(boolean isMeat, double price, String name) {
        super("Brown rye bread roll", isMeat, price, name);
    }

    public void addCheese() {
        this.price += 0.70;
        this.isCheese = true;
    }

    public void addPinapple() {
        this.price += 0.80;
        this.isPinapple = true;
    }

    public boolean isCheese() {
        return isCheese;
    }

    public boolean isPinapple() {
        return isPinapple;
    }
    @Override
    public void showBurger() {
        System.out.println("Name of the burger " + getName());
        System.out.println("Price of the burger: " + this.price);
        System.out.println("Inlucde luttace " + isLettuce());
        System.out.println("Inlucde carrot " + isCarrot());
        System.out.println("Inlucde cucumber " + isCucumber());
        System.out.println("Inlucde tomato " + isTomato());
        System.out.println("Inlucde tomato " + isTomato());
        System.out.println("Inlucde tomato " + isTomato());
        System.out.println("Inlucde cheese " + isCheese());
        System.out.println("Inlucde pinapple " + isPinapple());
    }
}
