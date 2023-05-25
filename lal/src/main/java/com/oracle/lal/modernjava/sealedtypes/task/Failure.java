package com.oracle.lal.modernjava.sealedtypes.task;

public record Failure(Throwable error) implements TaskResult {
}
