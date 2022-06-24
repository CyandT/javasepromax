package reflect;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("大a");
        s.setSex('男');
        s.setClassName("1ban");
        s.setScores(99.5);
        MyBatisUtil.save(s);

        Teacher t = new Teacher();
        t.setName("扎安");
        t.setSex('女');
        t.setTeachClass("2ban");
        t.setSalary(6000.0);
        MyBatisUtil.save(t);
    }
}
