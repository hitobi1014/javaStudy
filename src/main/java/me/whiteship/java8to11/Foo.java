package me.whiteship.java8to11;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {
        // Function
        Function<Integer,Integer> plus10 = (number) -> number+10;
        Function<Integer, Integer> multiply2 = (number) -> number * 2;

//        System.out.println(plus10.apply(1));
//        System.out.println(multiply2.apply(1));

        System.out.println(plus10.compose(multiply2).apply(10));
        System.out.println(plus10.andThen(multiply2).apply(10));


        // Consumer
//        Consumer<Integer> printT = (i) -> System.out.println(i);
//        printT.accept(10);

        // Supplier
//        Supplier<Integer> get10 = () -> 10;
//        System.out.println(get10);

        // Predicate
//        Predicate<String> startsWithMinun = (s) -> s.startsWith("minjun");
//        Predicate<Integer> isEven = (i) -> i % 2 == 0;

//        UnaryOperator<Integer> plus10 = (number) -> number+10;
//        UnaryOperator<Integer> multiply2 = (number) -> number * 2;
//
//        System.out.println(plus10.apply(1));

//        BinaryOperator<T>


    }
}
