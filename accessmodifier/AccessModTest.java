package com.accessmodifier;

public class AccessModTest {
    public static void main(String[] args) {
        AccessModifier ac = new AccessModifier();
        System.out.println();  //when create AccessModifier class private not able to call class
        System.out.println(ac.b); // when create AccessModifier class public able to call class .
        System.out.println(ac.b);// when create AccessModifier class protected able to call within the package
        ac.testJava();//able to call method when public and protected(within the package for protected) unable to call private
// default AccessModifier not able to access outside the package
    }
}
