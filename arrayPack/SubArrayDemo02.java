package com.prominentpixel.arrayPack;

import java.util.Arrays;

public class SubArrayDemo02 {
    // Generic method to get subarray of a non-primitive array
    // between specified indices
    public static int[] subArray(int[] array, int beg, int end) {
        return Arrays.copyOfRange(array, beg, end + 1);
    }


    public static void main(String args[]){
        int[] arr = { 0,1,2,3,4,5,6,7,8,9,10};
        int beg = 4, end = 9;

        int[] subarray = subArray(arr, beg, end);
        System.out.println(Arrays.toString(subarray));


    }
}
