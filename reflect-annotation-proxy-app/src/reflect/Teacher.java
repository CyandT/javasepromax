package reflect;

public class Teacher {
    private String name;
    private char sex;
    private String TeachClass;
    private double salary;

    public Teacher(String name, char sex, String teachClass, double salary) {
        this.name = name;
        this.sex = sex;
        TeachClass = teachClass;
        this.salary = salary;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getTeachClass() {
        return TeachClass;
    }

    public void setTeachClass(String teachClass) {
        TeachClass = teachClass;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
