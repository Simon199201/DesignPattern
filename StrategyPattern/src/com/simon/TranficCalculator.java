package com.simon;

import com.simon.base.Strategy;
import com.simon.impl.BusStrategy;
import com.simon.impl.SubwayStrategy;

/**
 *
 */
public class TranficCalculator {
    private Strategy strategy;
    public static void main(String[] args) {
        TranficCalculator tranficCalculator = new TranficCalculator();
        tranficCalculator.setStrategy(new BusStrategy());
        int total = tranficCalculator.calculatorPrice(10);
        System.out.println("乘坐大巴，消费："+total+"元");


        tranficCalculator.setStrategy(new SubwayStrategy());
        total = tranficCalculator.calculatorPrice(10);
        System.out.println("乘坐地铁，消费："+total+"元");
    }

    public int calculatorPrice(int km){
        return this.strategy.calculatePrice(km);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
