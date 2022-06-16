package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 方法二，不使用finally已经close实现资源释放
 */
public class Copy2 {
    public static void main(String[] args) {
//
        try(
                InputStream is = new FileInputStream("C:\\Users\\HP\\Pictures\\勾勾.jpeg");

                OutputStream os  = new FileOutputStream("C:\\Users\\HP\\Desktop\\狗狗.jpeg");
                ) {

//        3、定义一个字节数组转移数据(字节读取完毕返回-1)
            byte[] bytes = new byte[1024];
            int len;//每次读取的字节数
            while ((len = is.read(bytes)) != -1){
                os.write(bytes,0,len);
            }
            System.out.println("传输完成!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
