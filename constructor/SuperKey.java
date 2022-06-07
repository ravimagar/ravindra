package com.constructor;

public class SuperKey {
    int a=50; // variable
    SuperKey(){

        System.out.println(" i am default constructor");
    }
    SuperKey(int d ){
        System.out.println( d);
    }
    void show(){  // user defined method

        System.out.println(" Parent Class");  // print
    }
}
