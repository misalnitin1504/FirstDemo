package com.prominentpixel.abstractClassDemo;

import java.util.Scanner;

public class Test {
    public static void main(String args[]){
     int ans=1;
        Scanner sc=new Scanner(System.in);
     while (ans==1){
         System.out.println("Enter two numbers:");
         int a= sc.nextInt();
         int b= sc.nextInt();
         System.out.println("\n\n*****MENU****");
         System.out.println("1.Addition");
         System.out.println("2.Subtraction");
         System.out.println("3.Multiplication");
         System.out.println("4.Division");
         System.out.println("5.Exit");
         System.out.println("Enter your choice:");
         int ch= sc.nextInt();
         ArithmeticOperation ao[]={new Addition(), new Subtraction(),new Multiplication(), new Division()};
         switch (ch){
             case 1:
                 //Addition add=new Addition();
                 //add.perform(a,b);
                 ao[0].perform(a,b);
                 break;
             case 2:
                 //Subtraction sub=new Subtraction();
                 //sub.perform(a,b);
                 ao[1].perform(a,b);
                 break;
             case 3:
                 //Multiplication mul=new Multiplication();
                 //mul.perform(a,b);
                 ao[2].perform(a,b);
                 break;
             case 4:
                 //Division div=new Division();
                 //div.perform(a,b);
                 ao[3].perform(a,b);
                 break;
             case 5:
                 System.out.println("You exited successfully...Thank You");
                 System.exit(0);
             default:
                 System.out.println("Wrong Choice...");
                 break;
         }
         System.out.println("Do you want to continue(1/0):");
         ans= sc.nextInt();
         if(ans!=1){
             System.out.println("Program Terminated....Thank You");
         }
     }
    }
}
