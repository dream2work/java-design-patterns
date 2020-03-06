package com.dream2work.behavioral.interpreter;

public class Report {
    private String name;
    private String permission;

    public String getName() {
        return name;
    }

    public String getPermission() {
        return permission;
    }

    public Report(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }
}
