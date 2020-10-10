package com.simon;

import com.simon.base.Aggregate;
import com.simon.base.Iterator;
import com.simon.impl.ConcreteAggregate;

/**
 * 迭代器模式
 */
public class Main {
    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("hello");
        aggregate.add("iterator Pattern");
        aggregate.add("or Cursor Pattern");

        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
