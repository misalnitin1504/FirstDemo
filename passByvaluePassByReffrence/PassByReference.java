package com.prominentpixel.passByvaluePassByReffrence;

import java.util.ArrayList;

public class PassByReference {
    static void update(int a[])
        {
            // formal parameter
             a[0]++;
        }

    static void update2(ArrayList<Integer> A)
    {
        for (int i = 0; i < A.size(); ++i) {

            // update the item of
            // the arraylist
            A.set(i, A.get(i) + 1);
        }
    }
    public static void main(String[] args)
    {
        // using single array of element
        int a[] = new int[1];

        System.out.println("Number Value " + a[0]);

        // actual parameter
        update(a);

        System.out.println("Number Value " + a[0]);

        // using Arraylist collection
        ArrayList<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(2);

        System.out.println("List " + A);

        // actual parameter
        update2(A);

        System.out.println("Updated List " + A);
    }
}

