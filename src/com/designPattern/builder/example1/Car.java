package com.designPattern.builder.example1;

public class Car {
    private String model;
    private String engine;
    private int doors;
    private boolean hasSunroof;
    private boolean hasGPS;

    // Private constructor to ensure the object can only be created via the builder
    private Car(CarBuilder builder) {
        this.model = builder.model;
        this.engine = builder.engine;
        this.doors = builder.doors;
        this.hasSunroof = builder.hasSunroof;
        this.hasGPS = builder.hasGPS;
    }

    // Static inner Builder class
    public static class CarBuilder {
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

        // Build method to create the Car object
        public Car build() {
            return new Car(this); // Passing the builder to the Car constructor
        }
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", engine=" + engine + ", doors=" + doors +
                ", hasSunroof=" + hasSunroof + ", hasGPS=" + hasGPS + "]";
    }
}
