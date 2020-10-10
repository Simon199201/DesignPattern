package com.simon;

import com.simon.impl.VoltAdapter;
import com.simon.impl.VoltAdapter1;

public class Main {
    public static void main(String[] args) {
        VoltAdapter voltAdapter = new VoltAdapter();
        int volt5 = voltAdapter.getVolt5();
        System.out.println("电压是" + volt5);


        VoltAdapter1 voltAdapter1 = new VoltAdapter1();
    }
}
