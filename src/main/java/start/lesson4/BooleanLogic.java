package start.lesson4;

public class BooleanLogic {
    public static void main(String[] args) {
        boolean isBoughtBread = false;
        boolean isBoughtMilk = true;

        boolean isBoughtBreadAndMilk = isBoughtBread && isBoughtMilk;

        if (isBoughtBreadAndMilk){
            System.out.println("Молодец сынок, купил хлеб и молоко");
        } else if (isBoughtMilk){
            System.out.println("хотябы купил молоко");
        } else if (isBoughtBread) {
            System.out.println("хотябы купил хлеб");
        }else {
            System.out.println("ничего не купил");
        }

        System.out.println("-------------------------------------");

        boolean isBoughtCandy = false;
        if (!isBoughtCandy){
            System.out.println("мама хвалит сына");
        }







    }
}
