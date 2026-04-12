package oop.basics.lesson7.practice;

public class Practice {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", 220);
        Car kia = new Car("KIA", 220);
        Garage garage = new Garage();

        garage.setCar1(bmw);
        garage.setCar2(kia);

        garage.getInfoAboutCars();
    }
}
