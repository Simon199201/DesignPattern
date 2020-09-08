package com.simon.impl.peijian;

import com.simon.base.peijian.IBrake;

public class AdvancedBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
