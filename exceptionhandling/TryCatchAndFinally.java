package com.exceptionhandling;

public class TryCatchAndFinally {
    public static void main(String[] args) {
        try{
            System.out.println("hi");
            System.out.println(100/0);
//catch (Exception e) {
//    System.out.println(e);
        }
        finally {
            System.out.println("I am finally"); } }}
/*in this program I learned how to handle a  unchecked exception
    when we know the code is risky or it will throw a exception that time we can use try and catch exception handling
    on that code
    sop(e) means it will print the what kind of exception we are having in our code
    syntax of try and catch is try{ risky code} catch(DException e) {}

* */
