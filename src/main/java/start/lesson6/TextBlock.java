package start.lesson6;

public class TextBlock {
    public static void main(String[] args) {
//        String text = "Привет, как тебя зовут?\nМеня зовут Айбек. А тебя?\nМеня зовут Алмас!";
//        System.out.println(text);

        String name1 = "Айбек";
        String name2 = "Алмас";
        String text = """
                Привет, как тебя зовут?
                Меня зовут %s. А тебя?
                Меня зовут %s!
                """.formatted(name1, name2);
        System.out.println(text);

    }
}
