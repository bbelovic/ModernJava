package ocp.exam.service.api;

import com.oracle.lal.modernjava.sealedtypes.task.TaskResult;

public interface WebCrawler {
    long remainingSitesToCrawl();

    TaskResult getTaskResult(long taskId);

    private static boolean isValidId(long taskId) {
        return taskId > 0L;
    }

    private long convert(String taskId) {
        return Long.parseLong(taskId);
    }

}
