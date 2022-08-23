package com.oracle.lal.modernjava.patterns.task;

import java.util.concurrent.TimeoutException;

public class Client {
    private final TaskExecutor taskExecutor = new TaskExecutor();
    public void example() {
        Object taskResult = taskExecutor.executeTask(new Task());
        switch (taskResult) {
            case SuccessResult result -> System.out.println("Woohoo!");
            case FailureResult result && isTimeoutFailure(result.failure()) -> System.out.println("Timeout!!");
            case FailureResult result -> System.out.println("Oops");
            case CancelledResult result -> System.out.println("Cancelled");
            case null -> System.out.println("result is null");
            default -> System.out.println("Unknown task result");
        }

    }

    private boolean isTimeoutFailure(Throwable t) {
        return t instanceof TimeoutException;
    }
}
