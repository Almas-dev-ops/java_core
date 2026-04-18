package oop.inheritance.lesson9.defend_dogs;

import oop.inheritance.lesson9.dogs.Dog;

public final class Shepherd extends Dog {
    public Shepherd() {
        super(28);
    }

    @Override
    public void run() {
        System.out.println("Собака бежит быстро");
    }

    @Override
    public void breath() {
        System.out.println("Овчарка дышит");
    }

    @Override
    public void bark() {
        System.out.println("Овчарка громко лает");
    }

    @Override
    public void beAngry() {
        System.out.println("Cобака стоит " + countLegs + ".");
        System.out.println("Собака увидела чужого человека");
        super.beAngry();
        System.out.println("Овчарка успокоилась");
    }
}
