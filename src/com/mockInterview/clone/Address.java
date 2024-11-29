package com.mockInterview.clone;

public class Address implements Cloneable{
    public String Country;
    public String State;
    public String City;

    public Address() {
    }

    public Address(String country, String state, String city) {
        Country = country;
        State = state;
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Address cloned = (Address) super.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Country='" + Country + '\'' +
                ", State='" + State + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
