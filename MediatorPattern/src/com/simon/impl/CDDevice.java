package com.simon.impl;

import com.simon.base.Colleague;
import com.simon.base.Mediator;

public class CDDevice extends Colleague {
    private String data;//数据

    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read() {
        return data;
    }

    public void load() {
        System.out.println("光驱加载数据...");
        data = "视频数据,音频数据";
        this.mediator.changed(this);
    }
}
