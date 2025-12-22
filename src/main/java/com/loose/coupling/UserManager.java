package com.loose.coupling;

public class UserManager {

    private UserDataProvider userDataProvider;  // need dependency

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider; // dependency injection from main
    }

    public String getUserInfo() {
        return userDataProvider.getUserDetails();
    }
}
