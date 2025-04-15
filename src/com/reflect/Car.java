package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class Car {

    public String brand;
    public String type;
    public int year;
    private String VIN;

    public Car(String brand, String type, int year, String VIN){
        this.brand = brand;
        this.type = type;
        this.year = year;
        this.VIN = VIN;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "Car: " +
                "Brand: " + this.brand + ", Type: " + this.type + ", Year: " + this.year
                + ", VIN: " + this.VIN;
    }

    public static void main(String[] args){
        Class<?> objStr = String.class;
        System.out.println(objStr);
        try {
            Class<?> objStr2 = Class.forName("java.lang.String");
            System.out.println(objStr2);
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        Class<?> objStr3 = "Hello".getClass();
        System.out.println(objStr3);


        // step 1
        Class<?> classObj = Object.class;
        System.out.println(classObj + "\n");

        // step 2
        Member[] members = classObj.getDeclaredMethods();
        for (Member member : members) {
            System.out.println(member);
        }
        System.out.println("------------------------------------");
        try{
            Class<?> objCar = Car.class;
            Method method = objCar.getMethod("toString");
            System.out.println(method);
            Member[] members1 = objCar.getDeclaredFields();
            for(Member m : members1){
                System.out.println(m);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------------");

        try{
            Car car = new Car("Tsla", "ModelY", 2024, "5235FASF5FA242");
            Class<?> objCar5 = car.getClass();
            Field[] fields = objCar5.getDeclaredFields();
            for (Field field : fields){
                field.setAccessible(true);
                System.out.println(field.getName() +": " + field.get(car));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
