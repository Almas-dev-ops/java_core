package oop.class_object.equals_hashcode_practice;

public class Task {
    public static void main(String[] args) {
        User user1 = new User("login1", "1111");
        User user2 = new User("login2", "2222");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));

    }
}
