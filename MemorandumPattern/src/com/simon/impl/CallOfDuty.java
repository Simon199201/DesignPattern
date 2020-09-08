package com.simon.impl;

import com.simon.impl.Memento;

public class CallOfDuty {
    private int mCheckPoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    public void play() {
        System.out.println("玩游戏：" + String.format("第%d关", mCheckPoint) + "奋战杀敌中");
        mLifeValue -= 10;
        System.out.println("进度升级啦");
        mCheckPoint++;
        System.out.println(String.format("到达第%d关", mCheckPoint));
    }

    public void quit() {
        System.out.println("--------------");
        System.out.println("退出前的游戏属性" + this.toString());
        System.out.println("退出游戏");
        System.out.println("--------------");
    }

    public Memento createMemento() {
        Memento memento = new Memento();
        memento.mCheckPoint = this.mCheckPoint;
        memento.mLifeValue = this.mLifeValue;
        memento.mWeapon = this.mWeapon;
        return memento;
    }

    public void restore(Memento memento) {
        this.mCheckPoint = memento.mCheckPoint;
        this.mLifeValue = memento.mLifeValue;
        this.mWeapon = memento.mWeapon;
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckPoint=" + mCheckPoint +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }
}
