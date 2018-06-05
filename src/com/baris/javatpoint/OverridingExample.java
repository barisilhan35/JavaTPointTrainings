package com.baris.javatpoint;

/**
 * method must have same name as in the parent class
 * method must have same parameter as in the parent class.
 * must be IS-A relationship (inheritance).
 */

class Bank{
    int getRateOfInterest(){return 0;}
}

class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}

public class OverridingExample {

    public static void main(String[] args) {
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());

    }
}
