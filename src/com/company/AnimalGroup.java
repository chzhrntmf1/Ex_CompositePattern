package com.company;

import java.util.ArrayList;
import java.util.List;

/* Group */
public class AnimalGroup implements Animal {
    private List<Animal> animalGroup = new ArrayList<Animal>();

    public void add(Animal animal) {
        animalGroup.add(animal);
    }

    public void speak() {
        for (Animal animal : animalGroup) {
            animal.speak();
        }
    }
}
