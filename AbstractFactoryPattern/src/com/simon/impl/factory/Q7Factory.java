package com.simon.impl.factory;

import com.simon.base.factory.CarFactory;
import com.simon.base.peijian.IBrake;
import com.simon.base.peijian.IEngine;
import com.simon.base.peijian.ITire;
import com.simon.impl.peijian.AdvancedBrake;
import com.simon.impl.peijian.ImportEngine;
import com.simon.impl.peijian.SUVTire;

public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new AdvancedBrake();
    }
}
