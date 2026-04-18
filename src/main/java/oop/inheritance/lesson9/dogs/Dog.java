package oop.inheritance.lesson9.dogs;

public abstract class Dog {
    protected final int countLegs = 4;
    public int countTeeth;

    public static final String LATIN_NAME = "Canis familiaris";

    public Dog(int countTeeth) {
        this.countTeeth = countTeeth;
    }
    public void beAngry(){
        System.out.println("Собака рычит");
    }
    public void bark(){
        System.out.println("Собака громко лает");
    }

    public final void eat(){
        System.out.println("Собака ест");
    }

    public void breath(){
        System.out.println("Пудель дышит");
    }

    public abstract void run();
}
