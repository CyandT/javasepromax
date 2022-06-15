package ByteStream;

import java.io.*;

/**
 * 将某一路径文件拷贝到另一路径
 */
public class Copy {
    public static void main(String[] args) {
//        1、先创建一个字节输入流接通原文件
        try {
            InputStream is = new FileInputStream("C:\\Users\\HP\\Pictures\\勾勾.jpeg");

//        2、创建一个字节输出流接受拷贝文件
            OutputStream os = new FileOutputStream("C:\\Users\\HP\\Desktop\\狗狗.jpeg");

//        3、定义一个字节数组转移数据
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1){
                  os.write(bytes,0,len);
            }
            System.out.println("传输完成!");
//        4、关闭流
            os.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
