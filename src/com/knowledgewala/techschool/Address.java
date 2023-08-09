package com.knowledgewala.techschool;

public class Address {

    private String country;
    private String state;
    private String city;
    private String streetAddress;
    private String postalCode;
    private String type;

    public Address(String country, String state, String city, String streetAddress,
                   String postalCode, String type) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
