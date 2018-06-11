package com.spring.demos.quartz.jobs;

import org.springframework.stereotype.Component;

@Component("exampleBusinessObject")
public class ExampleBusinessObject {


    public void doIt() {
        // do the actual work

        System.out.println("同样是定时任务，这样子，可以不需要继承任何 Spring 的接口或者类,这个每三秒执行一次,不过，这个不可以接受参数");
    }
}
