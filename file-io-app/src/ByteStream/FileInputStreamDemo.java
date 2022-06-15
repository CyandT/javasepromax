package ByteStream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * 文件字节输入流相关用法
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception{
//        1、单纯读取一个字节
        /**
         * 读取中文字节时会出现乱码
         */
//        InputStream is = new FileInputStream("file-io-app\\src\\test.txt");
//        int reads = is.read();
//        System.out.println((char) reads);
//        int rd;
//        while ((rd = is.read()) != -1){
//            System.out.print((char) rd);
//        }

//        2、读取一个字节数组
//        InputStream is = new FileInputStream("file-io-app\\src\\test.txt");
//        byte[] bytes = new byte[3];
//        int read = is.read(bytes);
//        System.out.println("读取的字节数 :" + read);
//        int rd;
//        while ((rd = is.read(bytes)) != -1){
//            System.out.print(new String(bytes,0,rd));
//        }

//        3、读取全部数据
        InputStream is = new FileInputStream("file-io-app\\src\\test.txt");
        byte[] bytes1 = is.readAllBytes();
        String str = new String(bytes1);
        System.out.println(str);

    }
}
