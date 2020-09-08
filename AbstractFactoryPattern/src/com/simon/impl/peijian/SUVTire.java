package com.simon.impl.peijian;

import com.simon.base.peijian.ITire;

public class SUVTire implements ITire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
