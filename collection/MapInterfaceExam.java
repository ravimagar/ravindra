package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExam {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1 ,"Ravi");
        hm.put(2 ,"Magar");
        hm.put(3 ,"Wagholi");
        hm.put(4 ,"Pune");

        for (Map.Entry<Integer,String> e : hm.entrySet())
            System.out.println(e.getKey()+""+e.getValue());
    }
}
