package com.simon.impl;

import com.simon.base.Strategy;

import java.util.Random;

public class BusStrategy implements Strategy {
    @Override
    public int calculatePrice(int km) {
        int extraTotal = km -10;

        return new Random().nextInt(km);
    }
}
