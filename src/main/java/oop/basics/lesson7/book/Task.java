package oop.basics.lesson7.book;

public class Task {
    public static void main(String[] args) {
        Book book = new Book("Война и Мир", "Лев Толстой", 320, false);
        book.printCountRows();
        book.printCountRows(38);
        book.printInfo();
    }
}
