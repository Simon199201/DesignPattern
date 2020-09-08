package com.simon;

public class Main {
    public static void main(String[] args) {
        TVController tvController = new TVController();
        //设置开机状态
        tvController.powerOn();
        tvController.nextChannel();
        tvController.turnUp();
        System.out.println("看了一段时间电视，不想看啦...");
        tvController.powerOff();
        tvController.nextChannel();
    }
}
