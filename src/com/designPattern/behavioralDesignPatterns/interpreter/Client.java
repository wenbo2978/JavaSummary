package com.designPattern.behavioralDesignPatterns.interpreter;

import java.util.Set;

public class Client {
    public static void main(String[] args) {
        Expression rule =
                new AndExpression(
                        new TerminalExpression("ADMIN"),
                        new TerminalExpression("ACTIVE")
                );

        Context context = new Context(Set.of("ADMIN", "ACTIVE"));

        System.out.println(rule.interpret(context)); // true
    }
}
