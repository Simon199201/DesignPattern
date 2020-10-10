package com.simon.impl;

import com.simon.base.Colleague;
import com.simon.base.Mediator;

public class CPU extends Colleague {
    private String dataVideo,dataSound;
    public CPU(Mediator mediator) {
        super(mediator);
    }
    public void decodeData(String data){
        System.out.println("cpu解析数据 " +data);
        String[] dataArray = data.split(",");
        dataVideo = dataArray[0];
        dataSound = dataArray[1];
        System.out.println("cpu解析完 音频数据为 " +dataSound);
        System.out.println("cpu解析完 视频数据为 " +dataVideo);
        this.mediator.changed(this);

    }

    public String getDataVideo() {
        return dataVideo;
    }

    public void setDataVideo(String dataVideo) {
        this.dataVideo = dataVideo;
    }

    public String getDataSound() {
        return dataSound;
    }

    public void setDataSound(String dataSound) {
        this.dataSound = dataSound;
    }
}
