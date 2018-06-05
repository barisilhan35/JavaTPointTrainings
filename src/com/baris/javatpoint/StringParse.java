package com.baris.javatpoint;

public class StringParse {
    public static void main(String args[]){
        String s="200";
        //Java String to int Example: Integer.parseInt()
        int i=Integer.parseInt(s);
        System.out.println(s+100);//200100 because + is string concatenation operator
        System.out.println(i+100);//300 because + is binary plus operator

        //Java String to Integer Example: Integer.valueOf()
        String s1 = "200";
        Integer i1 = Integer.valueOf(s1);
        System.out.println(i1+100);//300

        //int to String
        int i2=10;
        String s2=String.valueOf(i2);//Now it will return "10"

        System.out.println(i2+100);//110 because + is binary plus operator
        System.out.println(s2+100);//10100 because + is string concatenation operator
    }
}
