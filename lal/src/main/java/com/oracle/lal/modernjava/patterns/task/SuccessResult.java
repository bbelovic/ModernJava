package com.oracle.lal.modernjava.patterns.task;

public record SuccessResult<T>(T result) implements TaskResult {
}
