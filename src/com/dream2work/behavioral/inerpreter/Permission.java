package com.dream2work.behavioral.inerpreter;

public class Permission implements PermissionExpression {
    private String permission;

    public Permission(String permission) {
        this.permission = permission.toUpperCase();
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(permission);
    }
}
