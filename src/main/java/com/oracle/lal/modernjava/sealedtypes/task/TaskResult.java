package com.oracle.lal.modernjava.sealedtypes.task;

public sealed interface TaskResult permits Success, Failure, Timeout {
}
