package test;

import java.util.function.Consumer;

public class Test2 {
    public static void main(String[] args) {
//        Consumer<Integer> consumer = (num) -> System.out.println("특정 작업 수행 : " + num * 20);
//        consumer.accept(200);

        Consumer<Integer> add = (num) -> System.out.println(num + " + 100 : " + (num + 100));
        Consumer<Integer> minus = (num) -> System.out.println(num + " - 100 : " + (num - 100));
        Consumer<Integer> multiply = (num) -> System.out.println(num + " * 100 : " + (num * 100));

        add.andThen(minus.andThen(multiply)).accept(50);



    }
}
