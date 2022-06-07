package com.hundredjavaprogram;

import static jdk.nashorn.internal.objects.NativeString.concat;

public class StringConcat {
    public static void main(String[] args) {
        String a = "abc";
        String b = "def";
        String c = "ghi";
      String d =  a.concat(b).concat(c);
        System.out.println(d);

    }
}
