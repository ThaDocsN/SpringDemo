package com.thadocizn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // TODO: 6/5/2019 load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // TODO: 6/5/2019 retreive bean from the container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // TODO: 6/5/2019 call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());
        // TODO: 6/5/2019 close the context
        context.close();
    }
}
