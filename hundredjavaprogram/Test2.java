package com.hundredjavaprogram;

public class Test2 {
    public static void main(String[] args) {

        String s ="RavindraMagar";
        String rev ="";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}

class ArrayOfMarks{
    public static void main(String[] args) {
        int[] marks = {10,20,30,40,50};
        for (int i=marks.length-1; i>= 0; i--){
            System.out.println(marks[i]);
        }
    }
}
class Fibo {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a +" "+b);
        int c;
        for(int i=1; i<=10; i++){
            c = a + b ;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
    }
}
class Table2{
    public static void main(String[] args) {
        int a= 2;
        for(int i=1; i<=10; i++){
            System.out.println(a+" x " +i + " = " +a*i);
        }
    }
}
class pyramid{
    public static void main(String[] args) {
        for(int i =1; i <=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
class reversePyramid{
    public static void main(String[] args) {
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
class odd{
    public static void main(String[] args) {
        for(int i =0; i <=10; i++){
        System.out.println(2*i+1);
    }
}
}
class even{
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println(2*i);
        }
    }
}
class tablerevesre{
    public static void main(String[] args) {
        int a=2;
        for (int i=10; i>=1; i--){
            System.out.println(a*i);
        }
    }
}
class decrement{
    public static void main(String[] args) {
        for (int j =7; j>0; j--){
            System.out.println(j);
        }
    }
}
class factoo{
    public static void main(String[] args) {
        int a = 5;
        int fact =1;
        for (int i=1 ; i<=a; i++){
            fact = fact*i;}
            System.out.println(fact);
        }
    }

