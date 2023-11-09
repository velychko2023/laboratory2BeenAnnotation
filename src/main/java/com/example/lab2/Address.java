package com.example.lab2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${address.street}")
    private String street;

    @Value("${address.city}")
    private String city;

    // Пустий конструктор (Spring потребує пустий конструктор)

    public Address() {
    }

    // Геттери і сеттери
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}


