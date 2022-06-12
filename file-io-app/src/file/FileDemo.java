package file;

import java.io.File;

/**
 * 1、file类的创建、删除、读取路径
 * 2、file类的遍历
 */
public class FileDemo {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\HP\\Pictures\\勾勾.jpeg");
        File file = new File("C:/Users/HP/Pictures/勾勾.jpeg");
        System.out.println(file.length());

        File file1 = new File("\u202AC:\\Users\\HP\\Pictures\\勾勾.jpeg");//绝对路径(磁盘中的文件)
        File file2 = new File("file-io-app\\src\\test.txt"); // 相对路径(存在于idea模块中的文件)
        System.out.println(file2.length());

        System.out.println(file.getAbsolutePath());

//        遍历文件中的文件，并打印出名称
        File file3 = new File("D:\\testjj");
        String[] names = file3.list();
        for (String s : names ) {
            System.out.println(s);
        }
//        遍历文件夹中的文件，添加到一个文件对象集合中
        File[] listFiles = file3.listFiles();
        for (File listFile : listFiles) {
            System.out.println(listFile.getAbsolutePath());
        }

    }
}
