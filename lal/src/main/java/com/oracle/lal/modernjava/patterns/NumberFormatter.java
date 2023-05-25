package com.oracle.lal.modernjava.patterns;

public class NumberFormatter {
    public String format(Number number) {
        if (number instanceof Integer i) {
            return String.format("%d", i);
        } else if (number instanceof Double d) {
            return String.format("%.2f", d);
        } else {
            return "" + number;
        }
    }
}
