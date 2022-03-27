package com.company.facade;

import com.company.Animal;

public class AnimalFacade {
    Animal animal;

    public AnimalFacade(Animal animal) {
        this.animal = animal;
    }

    public void live() {
        animal.eat();
        animal.sleep();
        animal.eat();
        animal.sleep();
        animal.eat();
        animal.sleep();
        animal.eat();
        animal.sleep();
        animal.die();
    }
}
