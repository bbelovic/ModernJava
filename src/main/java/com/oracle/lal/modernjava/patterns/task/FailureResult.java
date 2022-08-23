package com.oracle.lal.modernjava.patterns.task;

public record FailureResult(Throwable failure) implements TaskResult{
}
