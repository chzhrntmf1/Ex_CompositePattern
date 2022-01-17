package com.company;

public class Main {
    public static void main(String[] args) {

        AnimalGroup cat_group = new AnimalGroup();
        cat_group.add(new Cat());
        cat_group.add(new Cat());
        cat_group.add(new Cat());

        AnimalGroup dog_group = new AnimalGroup();
        dog_group.add(new Dog());
        dog_group.add(new Dog());

        AnimalGroup zoo = new AnimalGroup();
        zoo.add(cat_group);
        zoo.add(dog_group);

        zoo.speak();
    }
}
