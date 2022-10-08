package com.prominentpixel.abstractClassDemo;

public abstract class ArithmeticOperation {
    abstract void perform(int a, int b);
}
class Addition extends ArithmeticOperation {

    /**
     * @param a
     * @param b
     */
    @Override
    void perform(int a, int b) {
        int add = a + b;
        System.out.println("Addition=" + add);

    }
}
    class Subtraction extends ArithmeticOperation{

        /**
         * @param a
         * @param b
         */
        @Override
        void perform(int a, int b) {
            int sub=a-b;
            System.out.println("Subtraction="+sub);
        }
}
        class Multiplication extends ArithmeticOperation{

            /**
             * @param a
             * @param b
             */
            @Override
            void perform(int a, int b) {
                int mul=a*b;
                System.out.println("Multiplication="+mul);
            }
        }
    class Division extends ArithmeticOperation{

        /**
         * @param a
         * @param b
         */
        @Override
        void perform(int a, int b) {
        int div=a/b;
            System.out.println("Division="+div);
        }
    }

