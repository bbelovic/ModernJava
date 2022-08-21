package com.oracle.lal.modernjava.sealedtypes.task;

public class Client {
    private TaskExecutor taskExecutor;

    public void example() {
        Task task = new Task();
        TaskResult execute = taskExecutor.execute(task);
        switch (execute) {
            case Success success -> handleSuccess(success.get());
            case Failure failure -> handleFailure(failure.error());
            case Timeout timeout -> handleTimeout();
        }
    }

    private void handleTimeout() {

    }

    private void handleFailure(Throwable t) {

    }

    private void handleSuccess(Object result) {

    }
}
