package com.practicehome;

import java.util.regex.Pattern;

public class RegexMetaCharacter {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[\\d]", "4"));// Any digits, short of [0-9]
        System.out.println(Pattern.matches("[\\D]", "M")); // Any non-digit, short for [^0-9]
        System.out.println(Pattern.matches("[\\w]", "9"));// Any word character, short for [a-zA-Z_0-9]
        System.out.println(Pattern.matches("[\\W]", "#")); // Any non-word character, short for [^\w]
        System.out.println(Pattern.matches("[abc]", "b"));// a, b, or c (simple class)
        System.out.println(Pattern.matches("[a-z&&[^m-p]] ", "r"));//a through z, and not m through p: [a-lq-z](subtraction
        System.out.println(Pattern.matches("[^abc]", "d")); //Any character except a, b, or c (negation)
        System.out.println(Pattern.matches("[a-zA-Z]", "R"));// a through z or A through Z, inclusive (range)
        System.out.println(Pattern.matches("[[a-z&&[^bc]]]", "l")); // a through z, except for b and c: [ad-z] (subtraction)
        System.out.println(Pattern.matches("[[a-zA-Z0-9\\d{10}]]", "Ravi4"));
        System.out.println(Pattern.matches("[0-9]{10}", "9975048004"));
    }
}
