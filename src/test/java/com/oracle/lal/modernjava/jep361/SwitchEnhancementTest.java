package com.oracle.lal.modernjava.jep361;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.EnumSet;

public class SwitchEnhancementTest {

    @Test
    public void test() {

        var apTransactions = EnumSet.noneOf(Transaction.class);
        var arTransactions = EnumSet.noneOf(Transaction.class);
        for (var transaction: EnumSet.allOf(Transaction.class)) {
            var x = switch (transaction) {
                case CREDIT_MEMO, CUSTOMER_REFUND, INVOICE -> arTransactions.add(transaction);
                case VENDOR_BILL -> apTransactions.add(transaction);
                default -> throw new IllegalArgumentException("Unknown transaction: " + transaction);
            };
        }

        Assertions.assertEquals("AP", classifyTransaction(Transaction.VENDOR_BILL));
        Assertions.assertEquals("AR", classifyTransaction(Transaction.REMITTANCE_SUMMARY));

    }

    private String classifyTransaction(Transaction transaction) {
        return switch (transaction) {
            case CUSTOMER_REFUND, CUSTOMER_PAYMENT, INVOICE, CREDIT_MEMO, REMITTANCE_SUMMARY -> "AR";
            case VENDOR_BILL, VENDOR_PAYMENT -> "AP";
            default -> "unknown";
        };
    }
}
