package com.prominentpixel.lamdademos.lamdaexerciseedemos;

import java.util.function.BiPredicate;

/*
  * Your eventual goal is to make a method called betterString that takes two Strings and a lambda that says whether the first of the two is “better”.
  * The method should return that better String; i.e., if the function given by the lambda returns true, the betterString method should return the first String, otherwise betterString should return the second String.
Here are two examples of how your code should work when it is finished (the first lambda example returns whichever of string1 and string2 is longer, and the second lambda example always returns string1).
 - String string1 = ...;
 - String string2 = ...;
 - String longer = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
 - String first = StringUtils.betterString(string1, string2, (s1, s2) -> true);
Accomplishing all of this requires you to do three things:
 - Define the TwoStringPredicate interface. It will specify a method that takes 2 strings and returns a boolean. This interface is normal Java 7 code.
 - Define the static method betterString. That method will take 2 strings and an instance of your interface. It returns string1 if the method in interface returns true, string2 otherwise.
 - Call betterString. You can now use lambdas for the 3rd argument, as in the examples above
 */
//@FunctionalInterface
interface StringUtils{
    /*
    public default boolean twoString(String str1, String str2){
        if(str1.length()>str2.length())
            return true;

        else return false;
    }*/
    static String betterString(String str1, String str2, BiPredicate<String, String> checkString) {
        if(checkString.test(str1,str2)){
            //System.out.println(str1);
            return  str1;
        }
        else{
            //System.out.println(str2);
            return str2;
            }

    }

}
public class Demo02 {
    public static void main(String[] args) {
        String str1="Nitin";
        String str2="Kuldeep";

        String longer = StringUtils.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        String first =  StringUtils.betterString(str1, str2, (s1, s2) ->  true);

        System.out.println(longer);
        System.out.println(first);

    }
}
