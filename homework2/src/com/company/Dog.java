package com.company;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("dog eat");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep");
    }

    @Override
    public void die() {
        System.out.println("dog die");
    }
}
