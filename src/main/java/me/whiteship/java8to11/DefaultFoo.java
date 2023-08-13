package me.whiteship.java8to11;

public class DefaultFoo implements FooInter{

    String name;

    @Override
    public void printName() {
        System.out.println(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
