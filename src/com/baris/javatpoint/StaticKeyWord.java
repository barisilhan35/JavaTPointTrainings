package com.baris.javatpoint;

public class StaticKeyWord {
    public static void main(String[] args) {

        Student9 student9 = new Student9(123,"test");
        Student9.change();
        student9.display();
    }
}

class Student9 {
    int rollno;
    String name;
    static String college = "ITS";

    static void change() {
        college = "BBDIT";
    }

    Student9(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
