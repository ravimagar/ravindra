package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExam {
    public static void main(String[] args) {
        HashMap<Integer ,String> ha = new HashMap();
        ha.put(1,"hi");
        ha.put(2,"this is");
        ha.put(3,"Ravi");
        // ha.clear();
        System.out.println(ha.remove(0));
        for (Map.Entry<Integer,String> a :ha.entrySet())
            System.out.println(a.getKey()+ a.getValue());
    }
}
