package com.company.factory;

import com.company.Animal;
import com.company.Cat;
import com.company.Dog;

public class AnimalFactory {
    static public Animal makeAnimal(AnimalType type, String name, int age) {
        switch (type) {
            case CAT:
                return new Cat(name, age);
            case DOG:
                return new Dog(name, age);
        }
        return null;
    }
}
