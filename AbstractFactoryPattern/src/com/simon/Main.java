package com.simon;

import com.simon.base.factory.CarFactory;
import com.simon.impl.factory.Q3Factory;
import com.simon.impl.factory.Q7Factory;

public class Main {
    public static void main(String[] args) {
        CarFactory q3Factory = new Q3Factory();
        System.out.println("Q3 工厂开始生产...");
        q3Factory.createTire().tire();
        q3Factory.createEngine().engine();
        q3Factory.createBrake().brake();

        System.out.println("----------------");
        System.out.println("Q7 工厂开始生产...");

        CarFactory q7Factory = new Q7Factory();
        q7Factory.createTire().tire();
        q7Factory.createEngine().engine();
        q7Factory.createBrake().brake();

    }
}
