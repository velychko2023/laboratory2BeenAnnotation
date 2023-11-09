package com.example.lab2;

import com.example.lab2.Person;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("${employee.name}")
    private String name;

    @Autowired
    private Person person;

    @PostConstruct
    public void init() {
        System.out.println("Employee bean is being initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Employee bean is being destroyed.");
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}
