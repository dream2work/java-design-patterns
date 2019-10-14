package com.dream2work.behavioral.inerpreter;

public class AndExpression implements PermissionExpression {

    private PermissionExpression left;
    private PermissionExpression right;

    public AndExpression(PermissionExpression left, PermissionExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(User user) {
        return left.interpret(user) && right.interpret(user);
    }

    @Override
    public String toString() {
        return left + " AND " + right;
    }
}
