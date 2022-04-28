package indi.cola.d5_extend;

public class ExtendDemo1 {
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.setName("玛利亚");
        s.setAge(17);

        t.setName("塔利亚");
        t.setAge(17);

        s.searchId();
        t.searchM();
    }
}
