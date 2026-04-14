package oop.enumeration;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(Country.values()));
        System.out.println(Country.valueOf("JAPAN").getPeopleCount());
    }

    public static CountryOld[] getCountries() {
        CountryOld[] countries = new CountryOld[3];
        countries[0] =new CountryOld("Япония", 140_000_001, "японский");
        countries[1] =new CountryOld("греция", 10_000_001, "греческий");
        countries[2] =new CountryOld("Аргентина", 47_000_001, "испанский");
        return countries;
    }
}
