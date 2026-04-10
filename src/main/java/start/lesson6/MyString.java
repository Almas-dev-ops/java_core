package start.lesson6;

public class MyString {
    public static void main(String[] args) {
        char symbol = 'a';
        String text = new String("hey");
        String text2 = new String("hey");

        System.out.println(text.equals(text2));
        System.out.println(text == text2);
    }
}
