package com.erlich;

class Car {
    private String name;
    private boolean hasEngine;
    private int numberOfCylinders;
    private int numberOfWheels;
    public int accelerate;

    public Car(int numberOfCylinders, String name, int accelerate) {
        this.name = name;
        this.hasEngine = true;
        this.numberOfCylinders = numberOfCylinders;
        this.numberOfWheels = 4;
        this.accelerate = accelerate;
    }

    public String getName() {
        return name;
    }

    public boolean isHasEngine() {
        return hasEngine;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getAccelerate() {
        return accelerate;
    }

    public void startEngine() {
        System.out.println("ENGINE HAS STARTED");
    }

    public void setAccelerate(int accelerate) {
        this.accelerate = accelerate;
        System.out.println("ACCELERATION HAS BEEN ADDED");
    }

    public void brake() {
        this.accelerate = 0;
        System.out.println("YOU BRAKED YOUR CAR");
    }

}

class Porshe extends Car {
    public Porshe(int numberOfCylinders, String name, int accelerate) {
        super(numberOfCylinders, name, accelerate);
    }
    public void startEngine() {
        System.out.println("ENGINE HAS STARTED IN PORSHE");
    }

    public void setAccelerate(int accelerate) {
        this.accelerate = accelerate;
        System.out.println("ACCELERATION HAS BEEN ADDED IN PORSHE");
    }

    public void brake() {
        this.accelerate = 0;
        System.out.println("YOU BRAKED YOUR CAR IN PORSHE");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4,"Car",200);
        Porshe porshe = new Porshe(car.getNumberOfCylinders(),"Panamera",100);
        System.out.println(porshe.getName());
    }
}
