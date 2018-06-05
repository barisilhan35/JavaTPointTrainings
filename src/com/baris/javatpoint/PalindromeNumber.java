package com.baris.javatpoint;

/**
 * Get the number to check for palindrome
 Hold the number in temporary variable
 Reverse the number
 Compare the temporary number with reversed number
 If both numbers are same, print "palindrome number"
 Else print "not palindrome number"
 */

public class PalindromeNumber {

    public static void main(String[] args) {

        int r;
        int sum = 0;
        int temp;

        int n = 454;

        temp = n;
        while (n>0) {
            r = n%10;
            sum = (sum*10)+r;
            n=n/10;
        }

        if (temp==sum)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");

    }
}
