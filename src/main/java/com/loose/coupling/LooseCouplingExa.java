package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExa {
    public static void main(String[] args) {

        // manual bean creation and constructor injection without help of spring automatic injection using userMangeDb.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("userManageDb.xml");  // creating context
        UserManager userManager = (UserManager) context.getBean("userManagerWithUserDataProvider"); // object/bean creation

        System.out.println(userManager.getUserInfo());

        // --------------------------------------------------------------------//
        // we can reUse getUserInfo() that's why it is loosely coupled using interface.

        UserDataProvider webServiceProvider = new WebServiceDataProvider(); // Object is being created and using it runtime
        UserManager webServiceManager = new UserManager(webServiceProvider); // managed object creation at runtime using the IOC container
        // dependency passed to UserManager as it needed there and called

        System.out.println(webServiceManager.getUserInfo());

    }
}
