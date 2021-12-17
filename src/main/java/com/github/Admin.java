package com.github;

import lombok.Data;

import java.util.List;

@Data
public class Admin implements User {
    private String name;
    private final List<String> rights;

    @Override
    public void addRight(String right) {
        rights.add(right);
    }

    @Override
    public void removeRight(String right) {
        rights.remove(right);
    }

    void giveRightToUser(User user, String right) {
        user.addRight(right);
    }

    void takeRightFromUser(User user, String right) {
        user.removeRight(right);
    }
}
