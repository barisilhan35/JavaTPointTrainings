package com.baris.javatpoint;

import java.text.DecimalFormat;

/**
 * Java program to find the percentage of uppercase, lowercase, digits and special characters in a string
 */

public class CharacterPercentage {

    static void charPercentage(String input) {
        int totalChar = input.length();
        int upperCase = 0;
        int lowerCase = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            }
            else if (Character.isLowerCase(ch)) {
                lowerCase++;
            }
            else if (Character.isDigit(ch)) {
                digits++;
            }
            else special++;
        }
        double upperCaseLetterPercentage = (upperCase * 100) / totalChar;
        double lowerCaseLetterPercentage = (lowerCase * 100) / totalChar;
        double digitsPercentage = (digits * 100) / totalChar;
        double otherCharPercentage = (special * 100) / totalChar;

        DecimalFormat format = new DecimalFormat("##.##");
        System.out.println("In '" + input + "' : ");
        System.out.println("Uppercase letters are " + format.format(upperCaseLetterPercentage) + "% ");
        System.out.println("Lowercase letters are " + format.format(lowerCaseLetterPercentage) + "%");
        System.out.println("Digits Are " + format.format(digitsPercentage) + "%");
        System.out.println("Other Characters Are " + format.format(otherCharPercentage) + "%");

    }
    public static void main(String[] args) {
        charPercentage("Izmir is my city 100%");

        Character c = 'a';
        System.out.println(c);
    }
}
