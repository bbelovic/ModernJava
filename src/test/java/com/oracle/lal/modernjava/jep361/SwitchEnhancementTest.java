package com.oracle.lal.modernjava.jep361;

import org.junit.jupiter.api.Test;

import java.util.EnumSet;

public class SwitchEnhancementTest {

    @Test
    public void test() {

        var apTransactions = EnumSet.noneOf(Transaction.class);
        var arTransactions = EnumSet.noneOf(Transaction.class);
        for (var transaction: EnumSet.allOf(Transaction.class)) {
            switch (transaction) {
                case CREDIT_MEMO, CUSTOMER_REFUND, INVOICE -> arTransactions.add(transaction);
                case VENDOR_BILL -> apTransactions.add(transaction);
                default -> throw new IllegalArgumentException("Unknown transaction: " + transaction);
            }
        }

    }

    private String classifyTransaction(Transaction transaction) {
        return switch (transaction) {
            case CUSTOMER_REFUND, INVOICE -> "AR";
            case VENDOR_BILL -> "AP";
            default -> "unknown";
        };
    }
}
