package com.designPattern.behavioralDesignPatterns.interpreter;

public class TerminalExpression implements Expression{
    private final String value;

    public TerminalExpression(String value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context context) {
        return context.contains(this.value);
    }
}
