package oop.basics.lesson7.zoo;

import java.util.Arrays;

public class Cat {
    public String color;
    double weight;
    private String ownerName;

    public Cat(String color, double weight, String ownerName) {
        this.color = color;
        this.weight = weight;
        this.ownerName = ownerName;
    }

    public void destroySofa(String sofaOwner) {
        System.out.printf("Кот дерет диван %s\n", sofaOwner);
    }

    public String hunt(boolean isDay) {
        if (isDay) {
            return "Мышь";
        }
        return "Сова";
    }

    public String hunt(boolean isDay, boolean success) {
        if (success) {
            if (isDay) {
                return "Мышь";
            }
            return "Сова";
        }
        return "Ничего";
    }

    public void feed(String giver, String ...product){
        String formatted = """
                Человек %s дает еду. Кот поел: %s,
                """.formatted(giver, Arrays.toString(product));
        System.out.println(formatted);
    }

    public void hunt(String timesOfDay) {
        if (timesOfDay.equals("Утро")){
            System.out.println("Мышь");
        } else {
            System.out.println("Комар");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}







