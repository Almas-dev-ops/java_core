package start.lesson3;

public class Primitives {
    public static void main(String[] args) {
        //Логические значения (булевы значения) (bit)
        //ИСТИНА -> true -> да -> 1
        boolean answer = true;

        //ЛОЖЬ -> false -> нет -> 0
        boolean answer2 = false;

        //Целые числа
        //Byte - байт
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число, состоит из двух байт или из 16 битов
        short maxShort = 32_767;
        short minShort = -32_768;

        //Integer - целое число, которое состоит из 4 байт или из 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - целое число, которое состоит из 8 байт или из 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        double doubleNumber = 1.1234567890123467890;
        float floatNumber = 1.1234567890123467890F;
        //System.out.println(doubleNumber);
        //System.out.println(floatNumber);


        char letter = 70;
        System.out.println(letter);

        char newLine = '\n';
        System.out.println("a");
        System.out.println(newLine);
        System.out.println("b\n");
        char tab = '\t';
        char escape = '\\';
        System.out.println(escape);









    }
}
