package com.github;

import java.util.Map;

public class UserStorage {
    private Map<User, String> passwords;

    void addUser(User user, String password) {
        passwords.put(user, password);
    }

    String getUserPassword(User user) {
        return passwords.get(user);
    }
}
