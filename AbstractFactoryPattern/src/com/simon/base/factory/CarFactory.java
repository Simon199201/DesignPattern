package com.simon.base.factory;

import com.simon.base.peijian.IBrake;
import com.simon.base.peijian.IEngine;
import com.simon.base.peijian.ITire;

public abstract class CarFactory {
    public abstract ITire createTire();
    public abstract IEngine createEngine();
    public abstract IBrake createBrake();
}
