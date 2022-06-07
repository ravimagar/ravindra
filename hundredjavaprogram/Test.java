package com.hundredjavaprogram;

import java.util.Scanner;

public class Test {
    // for drawing any table with the help of for loop
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }

}

class Test1 {
    public static void main(String[] args) {
        int n = 22;
        if (n % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }
    }

}

// for odd number
class Test3 {
    public static void main(String[] args) {
        int n = 10;// first 10 numbers
        for (int i = 0; i < n; i++) { //
            System.out.println(2 * i + 1); // for odd number we need to add +1
        }
    }
}

//for even number
class Test4 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(i * 2);// for even number we need to
        }
    }

}

class ReverseString {
    public static void main(String[] args) {
        String s = "Magar";
        char ch = 0;
        String reve = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ch = s.charAt(i);
            reve = reve + ch;
        }

        System.out.println(reve);
    }
}

class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        int c;
        for (int i = 1; i <= 10; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;


        }
    }
}

class ScannerExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.next();
        System.out.println("enter age");
        char gender = sc.next().charAt(0);
        System.out.println("enter mobile no");
        long mob_no = sc.nextLong();
        System.out.println("enter flat");
        int flat_no = sc.nextInt();
    }
}

class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int no1 = s.nextInt();
        System.out.println("enter second number");
        int no2 = s.nextInt();
        System.out.println("select symbol(+,-,*,/)");
        String sym = s.next();
        int res;
        switch (sym) {
            case "+":
                res = no1 + no2;
                System.out.println("Add is" + res);
                break;
            case "-":
                res = no1 - no2;
                System.out.println("sub is" + res);
                break;
            case "*":
                res = no1 * no2;
                System.out.println("mul is" + res);
                break;
            case "/":
                res = no1 / no2;
                System.out.println("div is" + res);
                break;
            default:
                System.out.println("invalid");


        }
    }
}

class CalculatorUsingWhile {
    public static void main(String[] args) {
        String yn;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("enter first number");
            int no1 = s.nextInt();
            System.out.println("enter second number");
            int no2 = s.nextInt();
            System.out.println("select symbol(+,-,*,/)");
            String sym = s.next();
            int res;
            switch (sym) {
                case "+":
                    res = no1 + no2;
                    System.out.println("Add is " + res);
                    break;
                case "-":
                    res = no1 - no2;
                    System.out.println("sub is" + res);
                    break;
                case "*":
                    res = no1 * no2;
                    System.out.println("mul is" + res);
                    break;
                case "/":
                    res = no1 / no2;
                    System.out.println("div is" + res);
                    break;
                default:
                    System.out.println("invalid");

            }
            System.out.println("Do u want to continue(y for yes n for no)");
            yn = s.next();
        } while (yn.equals("y") || yn.equals("Y"));
    }
}

class Table {
    public static void main(String[] args) {
        int n = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

    }
}

class TableScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int no = s.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(no * i);
        }
    }
}
class Factorial{
    public static void main(String[] args) {
    int n =5;
    int fact =1;
    for(int i=1; i<=n; i++){
        fact = fact*i;
    }
        System.out.println(fact);
    }
}
class NumberReverse{

    public static void main(String[] args) {

        String a ="abcdef";
        char ch= 0;
        String reve = "";
        for(int i=a.length()-1; i>=0; i--){
            ch = a.charAt(i);
            reve = reve + ch;

        }
        System.out.println(reve);
    }
        }

class Practice{
    public static void main(String[] args) {
        int a=10,b=20;
        a = a+b;
        b = a-b;
        a= a-b;
        System.out.println("a value is "+a);
        System.out.println("b value is "+b);
    }
}