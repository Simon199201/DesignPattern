package com.simon.impl;

import com.simon.base.TVState;

public class PowerOnState implements TVState {
    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");

    }

    @Override
    public void nextChannel() {
        System.out.println("下一个节目");

    }

    @Override
    public void preChannel() {
        System.out.println("上一个节目");

    }
}
