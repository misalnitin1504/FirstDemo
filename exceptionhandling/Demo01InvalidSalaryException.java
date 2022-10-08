package com.prominentpixel.exceptionhandling;
class InvalidSalaryException  extends Exception
{
    public InvalidSalaryException (String str)
    {
        // calling the constructor of parent Exception
        super(str);
    }
}
public class Demo01InvalidSalaryException {
    // method to check the Salary
    static void validateSalary(int salary) throws InvalidSalaryException {
        if (salary > 87000) {

            // throw an object of user defined exception
            throw new InvalidSalaryException("Salary is not valid.");
        } else {
            System.out.println("welcome you can join company");
        }
    }

    // main method
    public static void main(String args[]) {
        try {
            // calling the method
            validateSalary(870000);
        } catch (InvalidSalaryException e) {
            e.printStackTrace();
            System.out.println("Caught the exception");

            // printing the message from InvalidSalaryException object
            System.out.println("Exception occurred: " + e);

        }
    }
}