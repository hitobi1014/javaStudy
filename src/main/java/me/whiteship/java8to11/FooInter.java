package me.whiteship.java8to11;

public interface FooInter {
    void printName();

    default void printNameUpperCase(){
        System.out.println(getName());
    }

    String getName();
}
