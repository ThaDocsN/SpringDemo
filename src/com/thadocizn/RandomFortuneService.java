package com.thadocizn;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    private String randomFortune(){
        String[] fortunes = {"Today is gonna be a bad day", "Today is your lucky day", "You need a day off"};
        int random = new Random().nextInt(fortunes.length);
        return fortunes[random];

    }
    @Override
    public String getFortune() {
        return randomFortune();
    }
}
