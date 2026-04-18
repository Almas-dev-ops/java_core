package oop.inheritance.lesson9.dogs;

import oop.inheritance.lesson9.defend_dogs.Shepherd;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Инфо о пудиле");

        Poodle poodle = new Poodle();
        poodle.bark();
        poodle.run();
        System.out.println(poodle.countTeeth);
        System.out.println("________________________________\n");

        System.out.println("Инфо об овчарке");
        Shepherd shepherd = new Shepherd();
        shepherd.bark();
        shepherd.run();
        shepherd.breath();
        shepherd.beAngry();
        System.out.println(shepherd.countTeeth);
        System.out.println("________________________________\n");

        System.out.println("Инфо об овчарке");
        Terier terier = new Terier(40);
        System.out.println(terier.countTeeth);


        System.out.println("________________________________\n");



    }
}
