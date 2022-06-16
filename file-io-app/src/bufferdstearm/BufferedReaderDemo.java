package bufferdstearm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * 使用缓冲字符输入流读取数据，并使用独有功能按行读取（经典代码）
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        try(
                Reader rd = new FileReader("file-io-app\\src\\test.txt");
                BufferedReader br = new BufferedReader(rd);
                ){

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
