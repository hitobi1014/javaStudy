package me.whiteship.java8to11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamApiTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("minjun");
        list.add("kim");
        list.add("choi");
        list.add("haha");

        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        stringStream.forEach(System.out::println);
        list.forEach(System.out::println);
    }
}
