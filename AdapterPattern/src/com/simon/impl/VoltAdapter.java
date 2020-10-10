package com.simon.impl;

import com.simon.base.Target;

public class VoltAdapter extends Volt220  implements Target{
    @Override
    public int getVolt5() {
        return 5;
    }
}
