package com.prominentpixel.junitdemos;

public class Demo01 {
    //method that returns max no
    public static int findMax(int arr[]){
        int max=0;//need arr[0]; instead of 0
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
}
