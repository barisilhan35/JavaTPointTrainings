package com.baris.javatpoint;

import java.util.Scanner;

public class PalindromeNumber2 {

    public static void main(String[] args) {
        String number;
        String reverse = "";

        Scanner in = new Scanner(System.in);
        System.out.println("enter a number: ");
        number = in.nextLine();

        int length = number.length();

        for (int i = length -1 ; i >= 0 ; i--) {
            reverse = reverse + number.charAt(i);
        }

        if (number.equals(reverse)) {
            System.out.println("number is palindrome");
        }
        else
            System.out.println("number is not palindrome");
    }
}
