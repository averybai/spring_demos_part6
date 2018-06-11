package com.spring.demos.quartz.jobs;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ExampleJob extends QuartzJobBean {

    private int timeout;

    /**
     * Setter called after the ExampleJob is instantiated
     * with the value from the JobDetailBean (5)
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
        // do the actual work

        System.out.println("这是一个定时任务，它会每五秒钟执行一次,它的 timeout 是 : " + timeout +" 感觉这是变相接收参数的一种方式");
    }
}
