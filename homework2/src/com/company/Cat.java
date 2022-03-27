package com.company;

public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }


    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep");
    }

    @Override
    public void die() {
        System.out.println("cat die");
    }
}
