package com.prominentpixel.methods;

import java.util.Scanner;

public class DemoCalculateFine {
    public static void calculateFine(int r_d,int r_m,int r_y,int d_d,int d_m,int d_y ){
        if (r_y>d_y){
            System.out.println("Fine = 10000 hackos");

        }
       else if (r_y < d_y || r_y < d_m || r_m == d_m && r_d <= d_d) {
            System.out.println("Fine = 0 hackos ");
        }
        else if(r_m==d_m){
            System.out.println("Fine = "+(15*(r_d-d_d))+" hackos ");

        } else  {
            System.out.println(500 * (r_m - d_m));


        }
    }

    public static void main(String[] args) {
        int ans=1;
        while (ans==1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Book Return Date:");
            int r_d = sc.nextInt(), r_m = sc.nextInt(), r_y = sc.nextInt();
            //Date returnDate=sc.ne
            System.out.println("Enter Due Date");
            int d_d = sc.nextInt(), d_m = sc.nextInt(), d_y = sc.nextInt();
            calculateFine(r_d, r_m, r_y, d_d, d_m, d_y);
            System.out.println("Do you want to continue(1/0):");
            ans= sc.nextInt();
        }
    }


}
/*
Enter Book Return Date:
12
12
2012
Enter Due Date
12
12
1011
Fine = 10000 hackos
Do you want to continue(1/0):
1
Enter Book Return Date:
12
12
1012
Enter Due Date
12
12
2012
Fine = 0 hackos
Do you want to continue(1/0):
1
Enter Book Return Date:
14
12
2012
Enter Due Date
12
12
2012
Fine = 30 hackos
Do you want to continue(1/0):
1
Enter Book Return Date:
12
12
2012
Enter Due Date
12
11
2012
500
Do you want to continue(1/0):

*/