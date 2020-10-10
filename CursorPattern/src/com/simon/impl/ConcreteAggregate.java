package com.simon.impl;

import com.simon.base.Aggregate;
import com.simon.base.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> list = new ArrayList<>();

//    public ConcreteAggregate(List<T> list) {
//        this.list = list;
//    }

    @Override
    public void add(T t) {
        list.add(t);
    }

    @Override
    public void remove(T t) {
        list.remove(t);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }
}
