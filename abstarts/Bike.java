package com.abstarts;

public class Bike extends Vehicle {
    Bike(int a) { // parameterized constructor created
        super(a); // call parent class variable by super key
    }

    @Override
    void start1() { //3. must implement parent class method for extend abstract class ,otherwise it will show error
        System.out.println("bike start with kick");
    }

    public static void main(String[] args) {  // use main method for run the program
        //  Vehicle v= new Vehicle();// 4. we can't create  abstract class object
        Bike b = new Bike(200); // initialize the value with the help of constructor
        b.start1();// called method with the help of object
    }
}
