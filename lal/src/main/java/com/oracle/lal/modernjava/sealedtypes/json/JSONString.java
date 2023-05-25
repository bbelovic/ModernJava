package com.oracle.lal.modernjava.sealedtypes.json;

public final class JSONString extends JsonValue {
    private final String value;

    public JSONString(String value) {
        this.value = value;
    }

    public String getValueAsString() {
        return value;
    }
}
