package com.prominentpixel.stringdemos;

public class RemoveSpacesDemo02 {
    public static void main(String args[]){
        //String str="      India Is My Country ";

        StringBuffer sbf=new StringBuffer("      India Is My Country ");
        StringBuilder sbl=new StringBuilder("      India Is My Country ");
        System.out.println("Before trim using StringBuffer::"+sbf);
        System.out.println("Before trim using StringBuilder:"+sbl);
        String newStr=sbf.toString();
        String newStr2=sbl.toString();
        String s1=newStr.trim();
        String s2=newStr2.trim();
        System.out.println("After trim using StringBuffer:"+s1);
        System.out.println("After trim using StringBuffer:"+s2);

    }
}
