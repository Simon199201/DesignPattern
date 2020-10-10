package com.simon.impl;

import com.simon.base.Colleague;
import com.simon.base.Mediator;

public class SoundCard extends Colleague {
    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void playSound(String data) {
        System.out.println("开始播放音频 " + data);
    }
}
