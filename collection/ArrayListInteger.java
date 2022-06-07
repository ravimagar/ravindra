package com.collection;

import java.util.ArrayList;

public class ArrayListInteger {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.remove(0);
        System.out.println(al.size());
        for (Object a : al) {
            System.out.println(a);
        }
    }
}
