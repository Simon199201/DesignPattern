package com.simon.impl;

import com.simon.base.Colleague;
import com.simon.base.Mediator;

public class MainBord extends Mediator {
    private CDDevice cdDevice;
    private CPU cpu;
    private GraphicsCard graphicsCard;
    private SoundCard soundCard;
    @Override
    public void changed(Colleague colleague) {
        if (colleague instanceof CDDevice) {
            System.out.println("数据加载完成");
            cpu.decodeData(((CDDevice) colleague).read());
        }
        if (colleague instanceof CPU) {
            soundCard.playSound(cpu.getDataSound());
            graphicsCard.playVideo(cpu.getDataVideo());
        }
    }

    public CDDevice getCdDevice() {
        return cdDevice;
    }

    public void setCdDevice(CDDevice cdDevice) {
        this.cdDevice = cdDevice;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }
}
