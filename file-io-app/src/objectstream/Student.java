package objectstream;

import java.io.Serializable;

/**
 * 序列化对象要继承Serializable接口
 */
public class Student implements Serializable {
    private String name;
    private String loginName;
    private String passWord;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public Student(String name, String loginName, String passWord) {
        this.name = name;
        this.loginName = loginName;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Student() {
    }
}
