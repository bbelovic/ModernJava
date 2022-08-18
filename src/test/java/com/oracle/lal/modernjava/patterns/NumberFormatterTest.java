package com.oracle.lal.modernjava.patterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class NumberFormatterTest {
    private final NumberFormatter formatter = new NumberFormatter();
    @Test
    public void formatNumber() {
        String actual = formatter.format(2);
        Assertions.assertEquals("2", actual);
        actual = formatter.format(6.0);
        Assertions.assertEquals("6.00", actual);
        Assertions.assertEquals("null", formatter.format(null));
        Assertions.assertEquals("0", formatter.format(BigDecimal.ZERO));
    }
}
