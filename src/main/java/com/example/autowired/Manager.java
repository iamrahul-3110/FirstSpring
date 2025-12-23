package com.example.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    @Autowired // feild injection without using constructor injection
    @Qualifier("employee") // when same type with different names multiple beans then mention this
    private Employee employee;

//    @Autowired  // dependency injection of employee here using constructor injection
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
