package com.prominentpixel.junitdemos;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestLogic01 {
    @Test
    public void testFindMax(){
         assertEquals(4,Demo01.findMax(new int[]{1,3,4,2}));
         assertEquals(-1,Demo01.findMax(new int[]{-12,-1,-3,-4,-2}));
    }
}
/*
java.lang.AssertionError:
Expected :-1
Actual   :0
* */