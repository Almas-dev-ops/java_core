package oop.basics.lesson7.recursion;

public class Recursion {

    public int sum(int number) {
        if (number < 1){
            return 0;
        }
        System.out.println(number);
        int result = number + sum(number - 1);
        return result;
    }
}
