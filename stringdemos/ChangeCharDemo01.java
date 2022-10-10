package com.prominentpixel.stringdemos;

public class ChangeCharDemo01 {
    public static void main(String args[]){
        String str="Ahamadabad";
        StringBuffer sbf=new StringBuffer(str);
        sbf.insert(5,'Z');
        String newStr=sbf.toString();
        System.out.println("New String: "+newStr);

        StringBuilder  sbl=new StringBuilder(str);
        sbl.insert(5,'Z');
        String newStr2=sbl.toString();
        System.out.println("New String2: "+newStr2);
    }
}
