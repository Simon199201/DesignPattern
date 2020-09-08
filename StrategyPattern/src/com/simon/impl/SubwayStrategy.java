package com.simon.impl;

import com.simon.base.Strategy;

import java.util.Random;

public class SubwayStrategy implements Strategy {
    @Override
    public int calculatePrice(int km) {
        return new Random().nextInt(km)+10;
    }
}
