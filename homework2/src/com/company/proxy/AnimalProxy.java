package com.company.proxy;

import com.company.Animal;
import com.company.AnimalActions;

public class AnimalProxy implements AnimalActionsProxyI {
    Animal realAnimal;

    public AnimalProxy(Animal realAnimal) {
        this.realAnimal = realAnimal;
    }

    @Override
    public void die() {
        if (realAnimal.getAge() < 5) {
            System.out.println("animal is too young! cant die");
        } else {
            realAnimal.die();
        }
    }
}
