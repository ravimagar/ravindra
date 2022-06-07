package com.collection;

import java.util.HashSet;

public class HashsetE {
    public static void main(String[] args) {
        HashSet ha = new HashSet();
        ha.add(1);
        ha.add(2);
        ha.add(3);
        ha.add(3); // duplicates objects are not allowed in the hashset
        ha.add("Ravi"); // insertion order is not preserved
        ha.add("Magar"); //  Heterogeneous object are allowed.
        ha.add("null"); // null insertion is possible but only once
        ha.add("null");
        ha.size();
        for (Object a : ha) {
            System.out.println(a);
        }
    }
}
// System.out.println(ha.size());
// System.out.println(ha.getClass());

