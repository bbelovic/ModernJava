package com.oracle.lal.modernjava.patterns;

public class NumberFormatterPatterns {
    public String formatNumber(Number number) {
        return switch (number) {
            case Integer i -> String.format("%d", i);
            case Double d -> String.format("%.2f", d);
            default -> "" + number;
        };
    }
}
