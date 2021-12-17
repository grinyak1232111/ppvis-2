package com.github;

import lombok.Data;

import java.util.List;

@Data
public class SubsectionUsers {
    String name;
    private final List<User> userList;
}
