package com.simon.impl.peijian;

import com.simon.base.peijian.ITire;

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
