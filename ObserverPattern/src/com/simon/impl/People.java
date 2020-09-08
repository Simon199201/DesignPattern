package com.simon.impl;

import java.util.Observable;
import java.util.Observer;

public class People implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("update ");
        System.out.println(arg);
    }
}
