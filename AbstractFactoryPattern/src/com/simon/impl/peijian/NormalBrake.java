package com.simon.impl.peijian;

import com.simon.base.peijian.IBrake;

public class NormalBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
