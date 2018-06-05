package com.baris.javatpoint;

// declare constant fields
// declare methods that abstract
// by default.

interface printable {
    void print();
}

class A6 implements printable {
    public void print() {
        System.out.println("printed");
    }
}

public class InterfaceTest {

    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}
