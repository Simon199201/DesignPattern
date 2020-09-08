package com.simon;

import com.simon.base.PowerController;
import com.simon.base.TVState;
import com.simon.impl.PowerOffState;
import com.simon.impl.PowerOnState;

public class TVController implements PowerController,TVState {
    private TVState mTVState;
    @Override
    public void powerOn() {
        setState(new PowerOnState());
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        setState(new PowerOffState());
        System.out.println("关机啦");
    }

    @Override
    public void turnUp() {
        this.mTVState.turnUp();
    }

    @Override
    public void turnDown() {
        this.mTVState.turnDown();

    }
    public void setState(TVState tvState){
        this.mTVState = tvState;
    }
    @Override
    public void nextChannel() {
        this.mTVState.nextChannel();
    }

    @Override
    public void preChannel() {
        this.mTVState.preChannel();
    }
}
