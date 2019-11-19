package com.erlich;

public class DeluxeBurger extends Hamburger{
    private boolean hasChips;
    private boolean hasDrink;

    public DeluxeBurger(String breadRollType, boolean isMeat, double price, String name) {
        super(breadRollType, isMeat, price, name);
        this.hasChips = true;
        this.hasDrink = true;
    }

    public boolean isHasChips() {
        return hasChips;
    }

    public boolean isHasDrink() {
        return hasDrink;
    }
    @Override
    public void showBurger() {
        System.out.println("Name of the burger " + getName());
        System.out.println("Price of the burger:" + this.price);
        System.out.println("Inlucde luttace" + isLettuce());
        System.out.println("Inlucde carrot" + isCarrot());
        System.out.println("Inlucde cucumber" + isCucumber());
        System.out.println("Inlucde tomato" + isTomato());
        System.out.println("Include chips" + isHasChips());
        System.out.println("Include drink" + isHasDrink());
    }

    @Override
    public void addCarrot() {
        System.out.println("You cant add additions for deluxe burger");
    }

    @Override
    public void addLettuce() {
        System.out.println("You cant add additions for deluxe burger");
    }

    @Override
    public void addCTomato() {
        System.out.println("You cant add additions for deluxe burger");
    }

    @Override
    public void addCucumber() {
        System.out.println("You cant add additions for deluxe burger");
    }
}
