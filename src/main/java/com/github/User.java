package com.github;

import java.util.List;

public interface User {
    List<String> getRights();
    void addRight(String right);
    void removeRight(String right);
}
