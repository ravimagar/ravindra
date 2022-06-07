package com.accessmodifier;

public class AccessModifier {
    // class name always start with capital letter and new word first letter also capital
    public int b = 10;
    public static int a;

    protected static void test() {
        int b = 10;
        int d = 20;
        System.out.println(a);// not getting output
    }

    public static void main(String[] args) {
        String nameOfMine = "Ravi"; // Variable name should be start with lower case and first letter of new word always in capital
        final float TEST_VARIABLE = 10.5f;    // Final variable value never change.
        System.out.println(TEST_VARIABLE);
    }

    public void testJava() { //// method name always start lowercase and new word first letter also capital
    }
}
