package file;

import java.io.File;
import java.io.IOException;

/**
 * 非规律递归
 * 根据D:目录找到ideaIU-2021.2.2.exe文件
 */
public class RecursionIrregular {
    public static void main(String[] args) {

        searchFile(new File("D:/"),"ideaIU-2021.2.2.exe");

    }

    /**
     * 1、搜索目录下的全部文件，找到我们需要的
     * @param file
     * @param fileName
     */
    private static void searchFile(File file,String fileName) {
        if(file != null && file.isDirectory()){

            File[] files = file.listFiles();
            if(files != null && files.length > 0){
                for (File f : files) {
                    if(f.isFile()){
                    if(f.getName().contains("ideaIU-2021.2.2.exe")){
                        System.out.println("找到了!在" + f.getAbsolutePath());
//                        try {
//                            Runtime runtime = Runtime.getRuntime();
//                            runtime.exec(f.getAbsolutePath());
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
                    }
                }
                }
            }else {
                searchFile(file,fileName);
            }

        }else {
            if(file.getName().equals(fileName)){
                System.out.println(file.getAbsolutePath());
                System.out.println("不要再找了!第一个就是~");
            }else {
                System.out.println("您找的文件不在这里面!");
            }
        }
    }
}
