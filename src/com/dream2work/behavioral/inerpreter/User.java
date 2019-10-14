package com.dream2work.behavioral.inerpreter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User {
    private String name;
    private List<String> permissions;

    public String getName() {
        return name;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public User(String name, String... permissions) {
        this.name = name;
        this.permissions = Stream.of(permissions)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
