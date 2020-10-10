package com.simon.impl;

import com.simon.base.Iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    private List<T> list;
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        return list.get(cursor++);
    }
}
