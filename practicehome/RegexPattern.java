package com.practicehome;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPattern {
    public static void main(String[] args) {
        int count =0;
        Pattern p = Pattern.compile("r");
        Matcher m = p.matcher("Ravindra Magar");
        while (m.find()){
            count++;
            System.out.println(m.start()+"--------"+ m.end()+ "---------"+m.group());
        }
        System.out.println(count);
    }
}
