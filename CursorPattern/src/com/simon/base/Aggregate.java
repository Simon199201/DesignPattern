package com.simon.base;

public interface Aggregate<T> {
    void add(T t);

    void remove(T t);

    Iterator<T> iterator();
}
