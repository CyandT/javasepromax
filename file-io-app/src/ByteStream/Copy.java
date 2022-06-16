package ByteStream;

import java.io.*;

/**
 * 1、将某一路径文件拷贝到另一路径
 * 2、为了防止程序中间出现bug导致无法关闭流，用finally代码块来释放资源
 */
public class Copy {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
//        1、先创建一个字节输入流接通原文件
        try {
            is = new FileInputStream("C:\\Users\\HP\\Pictures\\勾勾.jpeg");

//        2、创建一个字节输出流接受拷贝文件
            os = new FileOutputStream("C:\\Users\\HP\\Desktop\\狗狗.jpeg");

//        3、定义一个字节数组转移数据(字节读取完毕返回-1)
            byte[] bytes = new byte[1024];
            int len;//每次读取的字节数
            while ((len = is.read(bytes)) != -1){
                  os.write(bytes,0,len);
            }
            System.out.println("传输完成!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
 //        4、关闭流
            try {
                if(os != null)os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(is != null)is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
