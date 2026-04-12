package oop.basics.lesson7.zoo;

public class Zoo {
    private Cat cat;
    private Dog dog;

    public Zoo(Cat cat, Dog dog){
        if (cat == null){
            this.cat = new Cat("black", 15, "Aibek");
        }else {
            this.cat = cat;
        }
        this.dog = dog;
    }

    public void feed() {
        cat.feed("Aibek", "Рыбу");
        dog.feed("Айбек","Кости");
    }
}
