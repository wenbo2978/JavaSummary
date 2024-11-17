package com.designPattern.builder.example2;

public class CarBuilder {
    private String model;
    private String engine;
    private int doors;
    private boolean hasSunroof;
    private boolean hasGPS;

    // Builder methods for setting attributes
    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public CarBuilder setSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
        return this;
    }

    public CarBuilder setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
        return this;
    }

    // Build method to create a Car object
    public Car build() {
        return new Car(model, engine, doors, hasSunroof, hasGPS);  // Uses Car constructor
    }
}
