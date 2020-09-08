package com.simon;

import com.simon.impl.CallOfDuty;
import com.simon.impl.CareTaker;
import com.simon.impl.Memento;

public class Main {
    public static void main(String[] args) {
        CallOfDuty callOfDuty = new CallOfDuty();

        callOfDuty.play();

        //备忘状态
        Memento memento = callOfDuty.createMemento();
        CareTaker careTaker = new CareTaker();
        careTaker.setMemento(memento);

        callOfDuty.quit();

        //恢复游戏
        CallOfDuty callOfDuty1 = new CallOfDuty();
        callOfDuty1.restore(careTaker.getMemento());
        //继续玩游戏
        callOfDuty1.play();
        callOfDuty1.quit();
    }
}
