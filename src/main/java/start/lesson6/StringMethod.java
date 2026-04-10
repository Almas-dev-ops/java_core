package start.lesson6;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String text = "Hello world!";

        System.out.println(text.toLowerCase());

        System.out.println(text.toLowerCase());

        System.out.println(text.length());

        System.out.println(text.contains("Hel"));

        System.out.println(text.replace("l", "a"));

        System.out.println(text.repeat(3));

        String names = "Olga;Bob;Petr;Vasya";
        String[] split = names.split(";");
        for (String name : split) {
            System.out.print(name + ", ");
        }

        System.out.println(text.startsWith("Hel"));

        System.out.println(text.endsWith("world!"));

        System.out.println(text.substring(0, 5));

        String lenghtText2 = "hello".replaceAll("l", "a").toUpperCase();
        System.out.println(lenghtText2);

    }
}
