package com.oracle.lal.modernjava.records;

public record Range(long start, long end) {
    public Range {
        if (end < start) {
            throw new IllegalArgumentException("end < start");
        }
    }
}
