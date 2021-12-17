package com.github;

import lombok.Value;

import java.util.List;

@Value
public class UserController {
    User user;

    String getUserName() {
        // need to cast
        return "";
    }

    List<String> getRights() {
        return user.getRights();
    }

    void setUserName(String name) {
        // nothing to do
    }
}
