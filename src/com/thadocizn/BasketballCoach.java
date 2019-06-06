package com.thadocizn;

public class BasketballCoach implements Coach {

    private FortuneService fortuneService;

    public BasketballCoach() {
    }

    public BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Shoot a hundred free throws";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
