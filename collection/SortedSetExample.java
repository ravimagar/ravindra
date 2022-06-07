package com.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> ts = new TreeSet();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.first();
        ts.last();
        ts.add(4);
        ts.remove(2);
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
