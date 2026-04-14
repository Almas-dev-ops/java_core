package oop.enumeration;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        CountryOld[] countries = Runner.getCountries();
        System.out.println(Arrays.toString(countries));
    }
}
