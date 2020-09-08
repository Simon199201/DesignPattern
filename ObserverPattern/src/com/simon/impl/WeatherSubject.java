package com.simon.impl;

import java.util.Observable;

public class WeatherSubject extends Observable {
    public void publishNewWeather(String content){
        System.out.println("发出广播！！！");
        setChanged();
        notifyObservers(content);
    }
}
