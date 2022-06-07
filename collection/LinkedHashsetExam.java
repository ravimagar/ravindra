package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashsetExam {
    public static void main(String[] args) {
        LinkedHashSet li = new LinkedHashSet();
        li.add("ravi");
        li.add(9975048004l);
        li.add("magar");
        System.out.println(li);
        System.out.println(li.stream().findFirst());

    }
}
