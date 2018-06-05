package com.baris.javatpoint;

abstract class Bike {
    Bike(){System.out.println("bike is created");}
    abstract void run();
    void changeGear(){System.out.println("gear changed");}
}
class Honda4 extends Bike{

    @Override
    void run() {
        System.out.println("running safely");
    }
}

    public class AbstractClass {

        public static void main(String[] args) {
            Bike obj = new Honda4();
            obj.run();
            obj.changeGear();
        }
}
