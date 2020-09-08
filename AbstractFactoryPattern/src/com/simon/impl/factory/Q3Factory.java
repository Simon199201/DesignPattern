package com.simon.impl.factory;

import com.simon.base.factory.CarFactory;
import com.simon.base.peijian.IBrake;
import com.simon.base.peijian.IEngine;
import com.simon.base.peijian.ITire;
import com.simon.impl.peijian.DomesticEngine;
import com.simon.impl.peijian.NormalBrake;
import com.simon.impl.peijian.NormalTire;

public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
