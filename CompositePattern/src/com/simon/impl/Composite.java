package com.simon.impl;

import com.simon.base.Component;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> list = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (null != list) {
            for (Component component : list) {
                component.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component component) {
        list.add(component);
    }

    @Override
    public void removeChild(Component component) {
        list.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return list.get(index);
    }
}
