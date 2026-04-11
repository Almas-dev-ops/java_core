package oop.basics.lesson7;

import oop.basics.lesson7.zoo.Zoo;

public class Runner {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 10, "Aibek");
        Cat cat = new Cat("black",10, "Aibek");
        Zoo zoo = new Zoo(cat, dog);
        zoo.feed();
    }
}
