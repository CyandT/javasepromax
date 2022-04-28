package indi.cola.d5_extend;

public class People {
    private String name;
    private int age;

    public People() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void search(){
        System.out.println(name + "查询课程");
    }
}
