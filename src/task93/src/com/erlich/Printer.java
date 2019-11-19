package com.erlich;

public class Printer {
    private int tonerLevel;
    private int numberOfPages;
    private boolean isDuplex = false;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > -1 && tonerLevel <=100) {
        this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.numberOfPages = 0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void fillUp() {
        if(tonerLevel < 10) {
            tonerLevel = 100;
        }
    }

    public void printAPage() {
        numberOfPages++;
        System.out.println("You've already printed: " + numberOfPages);
    }

    public boolean switchDuplex() {
        return !isDuplex;
    }

}
