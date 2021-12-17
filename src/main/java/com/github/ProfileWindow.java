package com.github;

import java.util.List;

public class ProfileWindow {
    private final UserController userController;


    public ProfileWindow(UserController userController) {
        this.userController = userController;
    }

    String getUserName() {
        return userController.getUserName();
    }

    List<String> getRights() {
        return userController.getRights();
    }

    void setUserName(String userName) {
        userController.setUserName(userName);
    }
}
