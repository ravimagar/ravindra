package com.polymorphism;

public class Daughter extends MotherFather {
    void marry() {
        System.out.println(" i dont want to do marriage");
    }

    void marriage(){

    }
    public static void main( String args){
        System.out.println();

    }
    public static void main(String[] args) {
        Daughter d= new Daughter();
        d.marriage();
        d.marry();
    }
}
