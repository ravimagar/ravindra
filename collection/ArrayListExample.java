package com.collection;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(29);
        al.add("Ravi");
        al.add(99750480004L);
        al.remove(0);
        System.out.println(al.size());
        for (Object a : al) {
            System.out.println(a);

        }
    }
}
