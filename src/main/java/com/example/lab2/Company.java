package com.example.lab2;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
    @Value("${company.name}")
    private String name;

    @Autowired
    private Employee employee;

    @PostConstruct
    public void init() {
        System.out.println("Company bean is being initialized.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Company bean is being destroyed.");
    }


    public Company() {
    }

    // Геттери і сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employee=" + employee +
                '}';
    }
}



