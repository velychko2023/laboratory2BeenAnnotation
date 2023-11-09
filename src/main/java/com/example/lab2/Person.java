package com.example.lab2;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Value("${person.name}")
    private String name;

    @Autowired
    private Address address;

    @PostConstruct
    public void init() {
        System.out.println("Person bean is being initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Person bean is being destroyed.");
    }
    public Person() {
    }

    // Геттери і сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}


