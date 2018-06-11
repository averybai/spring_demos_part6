package com.spring.demos.quartz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Quartz uses Trigger, Job and JobDetail objects to realize scheduling of all kinds of jobs.
 *
 *  其中 Job 就是我们需要执行的任务，它可以是任何类中的任意方法.
 *  JobDetail 是一个 Job 加上相关的配置信息。
 *  Trigger 定义 JobDetail 的执行时间　
 *
 *  除此之外，还有个很重要的东西: SchedulerFactoryBean , 我个人称其为 调度器 ,它才是任务真正执行的地方，
 *  少了它，任务不会执行哦！！！
 *
 *
 */
public class TaskSchedulingByQuartzDemo {

    private static ClassPathXmlApplicationContext initContainer (){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        return context;
    }

    public static void main(String[] args){
//        InputStream is = new FileInputStream("spring/applicationContext.xml");
        ClassPathXmlApplicationContext context = initContainer();
//        context.start();
        System.out.println("服务已启动...... ");

        while (true) {
            try {
                synchronized (TaskSchedulingByQuartzDemo.class) {
                    Thread.currentThread().wait();
                }
            } catch (Exception e) {

            }
        }

    }
}
