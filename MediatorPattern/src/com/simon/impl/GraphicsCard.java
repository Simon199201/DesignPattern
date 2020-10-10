package com.simon.impl;

import com.simon.base.Colleague;
import com.simon.base.Mediator;

public class GraphicsCard extends Colleague {
    public GraphicsCard(Mediator mediator) {
        super(mediator);
    }
    public void playVideo(String videoData){
        System.out.println("视频开始播放 " +videoData);
    }
}
