package objectstream;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 对象序列化
 */
public class ObjectStreamDemo1 {
    public static void main(String[] args) throws Exception{
        Student s = new Student("大c","雪雪","123456");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file-io-app\\src\\obj"));

        oos.writeObject(s);
        System.out.println("序列化完成!");
        oos.close();

    }
}
