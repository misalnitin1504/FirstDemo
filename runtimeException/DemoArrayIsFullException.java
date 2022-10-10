package com.prominentpixel.runtimeException;

import java.util.Arrays;

class ArrayIsFullException extends RuntimeException{
    ArrayIsFullException(String str){
        super(str);
    }
}
public class DemoArrayIsFullException {
    public static void validateArray(int a[]) throws ArrayIsFullException{
        if(a.length>10){
            throw new ArrayIsFullException("Array length is greater than 10");
        }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,11};
        try {
            validateArray(a);
        }catch (ArrayIsFullException e){
            e.printStackTrace();
            System.out.println("Exception is:"+e);
            System.out.println();
            System.out.println("Array After Exception Handling: "
                    + Arrays.toString(Arrays.copyOf(a, 10)));
        }
        System.out.println("Rest of the code will be executed......");
    }

}
