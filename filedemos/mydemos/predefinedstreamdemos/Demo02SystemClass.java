package com.prominentpixel.filedemos.mydemos.predefinedstreamdemos;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Demo02SystemClass {
    public static void main(String[] args) {
        /*System Class extends object class, So it can override all the methods of object class
            - It is final class, so it cant be instantiated.
            - has 3 standard static fields/stream of PrintStream Class: out,err,in
            - Methods are:
                - arrayCopy(),exit(),gc(), currentTimeMillis()
                - console(), getenv(), clearProperty(),
                - set-getSecurityManager(), set-getProperty(),
                - setErr, setIn, setOut
                - load(), loadLibrary(), mapLibraryName()
                - nanoTime(), runFinalization(), lineSeparator(), identityHashCode(), inheritedChannel()

         */
        System.out.println("Standard/Default output Stream");
        System.err.println("Standard/Default input Stream");
        Scanner sc=new Scanner(System.in);

        System.out.println(System.getProperties());//Determines the current system properties.
        //System.out.println(System.getSecurityManager());
    }
}
