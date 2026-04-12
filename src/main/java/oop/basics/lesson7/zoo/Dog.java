package oop.basics.lesson7.zoo;

import java.util.Arrays;

public class Dog {
    private String name = "Lord";
    private int weight = 50;
    private String owner = "Aibek";

    //Блок инициализации
    {
        System.out.println("Собака родилась!");
    }

    public Dog(String name, int weight, String owner) {
        if (weight < 1){
            this.weight = 5;
        } else {
            this.weight = weight;
        }
        this.name = name;
        this.owner = owner;
    }

    public void feed(String giver, String ...product){
        String formatted = """
                Человек %s дает еду. Собака поела: %s,
                """.formatted(giver, Arrays.toString(product));
        System.out.println(formatted);
    }

    public void setWeight(int newWeight){
        if (newWeight < 1){
            this.weight = 5;
        }else {
            this.weight = newWeight;
        }
    }

    public String getOwner(){
        return "Mr." + owner;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                '}';
    }
}
