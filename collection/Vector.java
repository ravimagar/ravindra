package com.collection;

import java.util.Stack;

public class Vector {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        for (Object o : st){
            System.out.println(st);
        }
        System.out.println(st.size());
        System.out.println(st.lastElement());
        System.out.println(st.firstElement());
        System.out.println(st.capacity());
    }
}
