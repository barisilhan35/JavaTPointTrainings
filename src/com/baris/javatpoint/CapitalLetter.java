package com.baris.javatpoint;

/*
* We can capitalize each word of a string by the help of split() and substring() methods.
* By the help of split("\\s") method, we can get all words in an array.
* To get the first character, we can use substring() or charAt() method.
* */


class StringFormatter {

public static String capitalizeWord(String str) {
    String words[] = str.split("\\s");
    String capitalWord="";
    for (String w:words
         ) {
        String first=w.substring(0,1);
        String afterfirst=w.substring(1);
        capitalWord+=first.toUpperCase()+afterfirst+" ";
    }
    return capitalWord.trim();
}
}

public class CapitalLetter {
    public static void main(String[] args) {
        System.out.println(StringFormatter.capitalizeWord("my name is baris"));
        System.out.println(StringFormatter.capitalizeWord("little little into the middle"));
    }
}
