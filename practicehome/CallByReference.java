package com.practicehome;

public class CallByReference {
    float value = 10;

    void number(CallByReference cr){
        cr.value= cr.value+20;
    }
    public static void main(String[] args) {
        CallByReference cr = new CallByReference();
        System.out.println("before change "+ cr.value);
        cr.number(cr);
        System.out.println("after change " + cr.value);
    }
}
