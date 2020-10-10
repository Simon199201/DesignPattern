package com.simon;

import com.simon.impl.*;

public class Main {
    public static void main(String[] args) {
        MainBord mainBord = new MainBord();
        CPU cpu = new CPU(mainBord);
        CDDevice cdDevice = new CDDevice(mainBord);
        GraphicsCard graphicsCard = new GraphicsCard(mainBord);
        SoundCard soundCard = new SoundCard(mainBord);

        mainBord.setCpu(cpu);
        mainBord.setCdDevice(cdDevice);
        mainBord.setGraphicsCard(graphicsCard);
        mainBord.setSoundCard(soundCard);

        cdDevice.load();
    }
}
