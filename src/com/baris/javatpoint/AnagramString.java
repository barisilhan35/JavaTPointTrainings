package com.baris.javatpoint;

import java.util.Arrays;

/**
 * Two strings are called anagrams if they contain same set of characters but in different order.
 * "keep ? peek", "Mother In Law - Hitler Woman".
 *
 */

public class AnagramString {
    static void isAnagram(String s1, String s2) {
        String string1 = s1.replaceAll("\\s","");
        String string2 = s2.replaceAll("\\s","");

        System.out.println(string1);
        System.out.println(string2);

        boolean status =true;
        if (string1.length()!=string2.length()) {
            status = false;
            System.out.println("anagram incorrect");
            //return;
        }
        else {
            char[] ArrayS1 = string1.toLowerCase().toCharArray();
            char[] ArrayS2 = string2.toLowerCase().toCharArray();

            System.out.println(ArrayS1);

            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);

            System.out.println(ArrayS2);
            System.out.println(status);
        }
        if (status) {
            System.out.println("anagram correct");
        } else {
            System.out.println("anagram incorrect");
        }
    }

    public static void main(String[] args) {
        isAnagram("Keep","Peek");
        isAnagram("Mother In Law", "Hitler Woman");
        System.out.println("*********");
        isAnagram("afafaf","weqrqrq");
    }
}
