package com.mockInterview.interview03.solution1;

import java.math.BigDecimal;

public class CreditCardProcessor implements PaymentProcessor {

    private static final double PROCESSING_FEE_RATE = 0.02;

    @Override
    public double processPayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        return amount * (1 + PROCESSING_FEE_RATE);
    }

    @Override
    public double refundPayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero.");
        }
        return amount * (1 - PROCESSING_FEE_RATE);
    }
}
