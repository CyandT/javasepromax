package reflect;

public class Student {
    private String name;
    private char sex;
    private String className;
    private double scores;

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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    public Student(String name, char sex, String className, double scores) {
        this.name = name;
        this.sex = sex;
        this.className = className;
        this.scores = scores;
    }

    public Student() {
    }
}
