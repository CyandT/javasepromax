package indi.cola.d1_static;

public class User {
    public static int onlineUser = 161;
    private String name;
    private int age;

    public static void main(String[] args) {
        User.onlineUser++;
        System.out.println(onlineUser);

        User u = new User();
        u.name = "ale";
        u.age = 12;
        System.out.println(u.name);
        System.out.println(u.age);
        u.onlineUser++;
        System.out.println(onlineUser);
    }
}
