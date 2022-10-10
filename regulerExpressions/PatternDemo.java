package com.prominentpixel.regulerExpressions;

import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {

        System.out.println("\n"+Pattern.matches("[abcdefg]","abcdefg"));
        System.out.println("\n"+Pattern.matches("[abcde]","abcde"));
        System.out.println(Pattern.matches("[abc]","abc"));

        System.out.println("\n"+Pattern.matches("[abcde]+","abcde"));
        System.out.println("\n"+Pattern.matches("[a-zA-Z]+","abcde"));

        System.out.println(Pattern.matches("[abc]","abc"));
        System.out.println(Pattern.matches("[abc]","a"));
        System.out.println(Pattern.matches("[abc]+","abc"));

        System.out.println("\n"+Pattern.matches("[a-zA-Z]+","Nitin"));
        System.out.println("\n"+Pattern.matches("^[a-z0-9](\\.?[a-z0-9]){5,}@gmail.com$","misalnitin35.beit@gmail.com"));

//^[a-z0-9](\.?[a-z0-9]){5,}@g(oogle)?mail\.com$

    }
}
