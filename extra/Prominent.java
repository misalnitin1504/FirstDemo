package com.prominentpixel.extra;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;


final class Prominent {
    public static PrintStream pixel=new PrintStream(out );

    public static void main(String[] args) {
        Prominent.pixel.println("Nitin");
    }

}
