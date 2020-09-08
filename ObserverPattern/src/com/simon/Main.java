package com.simon;

import com.simon.impl.People;
import com.simon.impl.WeatherSubject;

public class Main {
    public static void main(String[] args) {
        People people1 = new People();
        People people2 = new People();
        People people3 = new People();
        People people4 = new People();
        WeatherSubject weatherSubject = new WeatherSubject();
        weatherSubject.addObserver(people1);
        weatherSubject.addObserver(people2);
        weatherSubject.addObserver(people3);
        weatherSubject.addObserver(people4);

        weatherSubject.publishNewWeather("今天晴，28度，微风2级");
    }
}
