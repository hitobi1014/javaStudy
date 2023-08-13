package me.whiteship.java8to11;

import java.util.function.BinaryOperator;
import java.util.function.IntConsumer;


public class Foo2 {
    public static void main(String[] args) {
//        int num1 = 30;
        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 + num2 + 20;
        System.out.println(binaryOperator.apply(10, 20));


    }

    private static void run() {
        int baseNumber = 10;

        IntConsumer printInt = (i) -> System.out.println(i + baseNumber);

        printInt.accept(10);

    }
}
