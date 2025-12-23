package com.example.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // transition from xml to annotation based;
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee.toString());

        Manager manager = (Manager) context.getBean("manager");
        System.out.println(manager.toString());
    }
}
