package com.simon.base;

import java.util.List;

public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }
    public abstract void doSomething();
    public abstract void addChild(Component component);
    public abstract void removeChild(Component component);
    public abstract Component getChild(int index);
}
