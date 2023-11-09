package com.example.lab2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab2Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Company company = context.getBean(Company.class);

        // Виводимо інформацію про компанію та її працівника
        System.out.println("Company Name: " + company.getName());
        System.out.println("Employee Name: " + company.getEmployee().getName());
        System.out.println("Person Name: " + company.getEmployee().getPerson().getName());
        System.out.println("Address: " + company.getEmployee().getPerson().getAddress().getStreet() + ", " + company.getEmployee().getPerson().getAddress().getCity());
    }
}
