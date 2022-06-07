package com.collection;

import java.util.TreeSet;

public class TreeSetExam {
    public static void main(String[] args) {
        TreeSet<Integer> tr = new TreeSet();
        tr.add(5); // Insertion order is not preserved
        tr.add(10);
        tr.add(15);
        tr.add(20);  // Duplicates objects are not allowed
        tr.add(20);
        for (Integer i : tr) {
            System.out.println(i);
        }
    }
}

