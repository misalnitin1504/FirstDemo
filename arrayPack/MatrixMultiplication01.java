package com.prominentpixel.arrayPack;

public class MatrixMultiplication01 {
    public static void printMatrixMultiplication(int a[][],int b[][]){
        int c[][]= new int[3][3];
        for(int i=0;i<3;i++){
            for (int j=0;j<3; j++){
                c[i][j]=0;
                for (int k=0;k<3;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){

        int a[][]={{1,2,3}, {1,2,3}, {1,2,3}};
        int b[][]={{1,2,3}, {1,2,3}, {1,2,3}};
        printMatrixMultiplication(a,b);
    }
}
