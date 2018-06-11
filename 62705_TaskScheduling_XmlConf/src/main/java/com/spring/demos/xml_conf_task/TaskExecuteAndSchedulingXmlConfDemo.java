package com.spring.demos.xml_conf_task;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileNotFoundException;

/**
 *
 *
 *
 */
public class TaskExecuteAndSchedulingXmlConfDemo {

    private static ClassPathXmlApplicationContext initContainer (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        return context;
    }

    public static void main(String[] args){
//        InputStream is = new FileInputStream("spring/applicationContext.xml");
        ClassPathXmlApplicationContext context = initContainer();
        context.start();
        System.out.println("服务已启动...... ");

        while (true) {
            try {
                synchronized (TaskExecuteAndSchedulingXmlConfDemo.class) {
                    Thread.currentThread().wait();
                }
            } catch (Exception e) {

            }
        }

    }
}
