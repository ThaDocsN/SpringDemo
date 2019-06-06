package com.thadocizn;

public class BaseballCoach implements Coach{

    // TODO: 6/5/2019 define a private field for the dependency
    private FortuneService fortuneService;

    // TODO: 6/5/2019 define a constructor for dependency


    public BaseballCoach() {
    }

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
