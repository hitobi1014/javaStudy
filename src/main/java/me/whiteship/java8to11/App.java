package me.whiteship.java8to11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class App {

    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("kim");
        name.add("sim");
        name.add("dim");
        name.add("qim");

        Function<Integer, int[]> function = int[]::new;


    }

}
