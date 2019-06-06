package com.thadocizn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {
    public static void main(String[] args) {
        // TODO: 6/5/2019 load spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // TODO: 6/5/2019 retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", FootballCoach.class);

        // TODO: 6/5/2019 call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        //System.out.println(theCoach.getEmail());
        //System.out.println(theCoach.getTeam());
        // TODO: 6/5/2019 close the context
        context.close();
    }
}
