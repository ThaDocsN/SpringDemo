package com.thadocizn;

public class FootballCoach implements Coach {

    public FootballCoach(RandomFortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice your throwing skills for 2 hours today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
