package com.simon.impl;

import com.simon.base.Target;

public class VoltAdapter1 implements Target {
    private Volt220 volt220;

    public VoltAdapter1(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
