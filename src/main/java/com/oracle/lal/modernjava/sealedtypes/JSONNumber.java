package com.oracle.lal.modernjava.sealedtypes;

import java.math.BigDecimal;

public non-sealed class JSONNumber extends JsonValue {
    private Number number;

    public BigDecimal getValueAsBigDecimal() {
        return new BigDecimal(number.longValue());
    }

    public Long getValueAsLong() {
        return number.longValue();
    }
}
