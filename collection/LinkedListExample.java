package com.collection;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(0);
        li.add(1);
        li.add("Two");
        li.add(3);
        li.addFirst(10);
        li.addLast(20);
        li.remove(2);
        System.out.println(li.size());
        for(Object o : li);
        System.out.println(li);
    }
}
