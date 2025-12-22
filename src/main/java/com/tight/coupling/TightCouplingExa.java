package com.tight.coupling;

public class TightCouplingExa {
    public static void main(String[] args) {

        // you can't reuse the getUserInfo() for others - tightly coupled.
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
