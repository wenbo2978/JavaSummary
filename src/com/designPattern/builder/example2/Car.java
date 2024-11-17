package com.designPattern.builder.example2;

public class Car {
    // Car attributes (private fields)
    private String model;
    private String engine;
    private int doors;
    private boolean hasSunroof;
    private boolean hasGPS;

    // Constructor for Car (public or package-private, since the builder is external)
    public Car(String model, String engine, int doors, boolean hasSunroof, boolean hasGPS) {
        this.model = model;
        this.engine = engine;
        this.doors = doors;
        this.hasSunroof = hasSunroof;
        this.hasGPS = hasGPS;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", engine=" + engine + ", doors=" + doors +
                ", hasSunroof=" + hasSunroof + ", hasGPS=" + hasGPS + "]";
    }
}
