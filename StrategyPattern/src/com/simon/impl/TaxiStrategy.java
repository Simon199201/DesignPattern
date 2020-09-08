package com.simon.impl;

import com.simon.base.Strategy;

import java.util.Random;

public class TaxiStrategy implements Strategy {
    @Override
    public int calculatePrice(int km) {
        return new Random().nextInt(km)+100;
    }
}
