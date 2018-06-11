package com.spring.demos.xml_conf_task.task;

import org.springframework.stereotype.Component;

@Component("myTasks")
public class MyTasks {


    public void cronTask() {
        // something that should execute on weekdays only
        System.out.println("this is a task trigger by a cron trigger , it executed every 5 seconds. ");
    }


}
