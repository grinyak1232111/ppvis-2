package com.github;

import lombok.Data;

import java.util.List;

@Data
public class Gardener implements User {
    String name;
    List<String> rights;

    @Override
    public void addRight(String right) {
        rights.add(right);
    }

    @Override
    public void removeRight(String right) {
        rights.remove(right);
    }
}
