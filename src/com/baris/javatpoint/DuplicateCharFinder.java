package com.baris.javatpoint;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharFinder {
    private void find(String str) {
        Map<Character,Integer> baseMap = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        System.out.println(charArray);
        System.out.println(baseMap);

        for (Character character : charArray) {
            //System.out.println(character);
            if (baseMap.containsKey(character)) {
                baseMap.put(character, baseMap.get(character) + 1);
            }
            else {
                baseMap.put(character,1);
               // System.out.println("else");

            }
        }
        Set<Character> keys = baseMap.keySet();
        System.out.println(keys);

        for (Character character : keys) {
            if (baseMap.get(character) > 1) {
                System.out.println(character + " " + baseMap.get(character) + " times");
            }
        }
    }

    public static void main(String a[]) {
        DuplicateCharFinder dcf = new DuplicateCharFinder();
        dcf.find("Batman Dark Knight");
    }
}
