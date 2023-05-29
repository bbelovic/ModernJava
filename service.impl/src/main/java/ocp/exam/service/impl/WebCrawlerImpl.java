package ocp.exam.service.impl;

import com.oracle.lal.modernjava.sealedtypes.task.Success;
import com.oracle.lal.modernjava.sealedtypes.task.TaskResult;
import ocp.exam.service.api.WebCrawler;

public class WebCrawlerImpl implements WebCrawler {
    @Override
    public long remainingSitesToCrawl() {
        return -1;
    }

    @Override
    public TaskResult getTaskResult(long taskId) {
        return new Success<>();
    }
}
