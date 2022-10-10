package com.prominentpixel.stringdemos;

public class Demo4 {
    static public int largeSubString(String str, String sub) {

        int strLen = str.length();
        int subLen = sub.length();
        if(strLen<subLen)
        {
            return 0;
        }
        if(str.substring(0,subLen).equals(sub))
        {
            if(str.substring(strLen-subLen,strLen).equals(sub))
            {
                return strLen;
            }
            else
            {
                return  largeSubString(str.substring(0,strLen-1),sub);
            }
        }
        else
        {
            return  largeSubString(str.substring(1,strLen),sub);
        }
    }

    public static void main(String[] args) {
        //String
        System.out.println("1st Result: "+ largeSubString("catcowcat","cat"));
        System.out.println("2nd Result: "+ largeSubString("catcowcat","cow"));
        System.out.println("3rd Result: "+ largeSubString("cccatcowcatxx","cat"));



    }
}
