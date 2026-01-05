package com.designPattern.behavioralDesignPatterns.interpreter;

public class AndExpression implements Expression{
    private final Expression left;
    private final Expression right;

    AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context context) {
        return left.interpret(context) && right.interpret(context);
    }
}
