package objectstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 对象反序列化
 */
public class ObjectStreamDemo2 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file-io-app\\src\\obj"));

        Student s = (Student) ois.readObject();
        System.out.println(s);
    }
}
