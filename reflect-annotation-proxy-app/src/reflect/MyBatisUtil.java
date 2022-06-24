package reflect;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**
 * 提供一个通用框架，保存对象具体信息到文件中
 */
public class MyBatisUtil {
    public static void save(Object obj){
        try (
                PrintStream ps = new PrintStream(new FileOutputStream("reflect-annotation-proxy-app\\src\\reflect\\msg.txt",true))
                ){
            Class c = obj.getClass();

            Field[] fields = c.getDeclaredFields();
            ps.println("======="+ c.getSimpleName() +"======");
            for (Field field : fields) {
                String name = field.getName();
                //从这个对象里取出成员变量对应的值
                field.setAccessible(true);
                String value = field.get(obj) + "";
                ps.println(name + "=" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
