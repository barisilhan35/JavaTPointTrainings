package com.baris.javatpoint;

/**
 * In this example, we are creating the no-arg constructor in the Bike class. It will be invoked at the time of object creation.
 * Rule: If there is no constructor in a class, compiler automatically creates a default constructor.
 */

class Cons1 {
    Cons1() {
        System.out.println("constructor is created");
    }
}
class Cons2 {
    int id;
    String name;
    void display() {
        System.out.println(id + " " + name);
    }
}
public class Constructors {

    public static void main(String[] args) {
        Cons1 c = new Cons1();
        Cons2 c2 = new Cons2();
        c2.display();

    }
}
