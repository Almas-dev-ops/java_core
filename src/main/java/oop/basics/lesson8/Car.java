package oop.basics.lesson8;

import java.util.Arrays;

public class Car {
    private String brand;
    public static int countCars = 0;
    public final static String BMW_INFO = "BMW - немецкая компания, основана 1928";
    public final static String AUDI_INFO = "AUDI - немецкая компания, основана 1933";
    public final static String KIA_INFO = "KIA - немецкая компания, основана 1978";

    public final static String[] BRAND_DESCRIPTION = new String[3];

    static {
        BRAND_DESCRIPTION[0] = BMW_INFO;
        BRAND_DESCRIPTION[1] = AUDI_INFO;
        BRAND_DESCRIPTION[2] = KIA_INFO;
        System.out.println(Arrays.toString(BRAND_DESCRIPTION));
    }

    public Car(String brand) {
        this.brand = brand;
        countCars++;
    }

    public int getCountCars() {
        return countCars;
    }

    public static void printBrand() {
        System.out.println("Перечень доступных брендов: BMW, AUDI, KIA");
    }
}
