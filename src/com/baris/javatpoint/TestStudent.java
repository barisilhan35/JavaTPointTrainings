package com.baris.javatpoint;

/**
 * In this example, we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method.
 * Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.
 */

class Student {
    int no;
    String name;

    void insertRecord(int r, String n) {
        no = r;
        name = n;
    }
    void displayInfo() {
        System.out.println(no + " " + name);
    }
}

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.insertRecord(100,"baris");
        s2.insertRecord(101,"bari");

        s1.displayInfo();

    }
}
