package com.prominentpixel.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class InvalidElasticsearchPortConfiguration extends Exception{
    public InvalidElasticsearchPortConfiguration(String str){

        // calling the constructor of parent Exception
        super(str);
    }
}
public class Demo04InvalidElasticsearchPortConfiguration {
    static void validateInputInteger(int a) throws InvalidElasticsearchPortConfiguration {

        if (a > 65000) {
            throw new InvalidElasticsearchPortConfiguration("Invalid Elasticsearch port configuration");
        } else {
            System.out.println("Input is valid Integer...");

        }
    }

    public static void main(String args[]) {
        try {
            //Scanner sc=new Scanner(System.in);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter value: ");
            //int a= sc.nextInt();
            int a=Integer.parseInt(br.readLine());
            // calling the method
            validateInputInteger(a);
        } catch ( IOException ioException){
            ioException.printStackTrace();
            System.out.println("Caught the exception");
            // printing the message from InvalidElasticsearchPortConfiguration object
            System.out.println("Exception occurred: " + ioException);
        }
        catch (InvalidElasticsearchPortConfiguration e) {
            e.printStackTrace();
            System.out.println("Caught the exception");
            // printing the message from InvalidElasticsearchPortConfiguration object
            System.out.println("Exception occurred: " + e);
        }
        System.out.println("Rest of the code will be executed........");
    }
}
