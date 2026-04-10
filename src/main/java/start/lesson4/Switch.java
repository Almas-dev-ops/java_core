package start.lesson4;

public class Switch {
    public static void main(String[] args) {
        int numberDay = 2;

        switch (numberDay){
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Данного дня не существует");
        }

//                if (numberDay == 1) {
//            System.out.println("Понедельник");
//        } else if (numberDay == 2) {
//            System.out.println("Вторник");
//        }
    }
}
