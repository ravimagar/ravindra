package com.practicehome;

public class CallByValue {
    
        double d = 100;
        void num(double d){
            d = d+900;
            System.out.println(d);
        }

        public static void main(String[] args) {
            CallByValue ca= new CallByValue();
            System.out.println("before change " +ca.d );
            ca.num(500);
            System.out.println("after change "+ ca.d);

        }
}
