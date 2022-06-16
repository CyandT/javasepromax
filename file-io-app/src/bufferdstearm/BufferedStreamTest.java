package bufferdstearm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 完成拷贝出师表并且排序
 */
public class BufferedStreamTest {
    public static void main(String[] args) {
//        1、创建缓冲字符输入流接受文本并且存入集合中
        try(
                BufferedReader rd = new BufferedReader(new FileReader("file-io-app\\src\\csb.txt"));

                //         3、创建缓冲字符输出流拷贝文本数据
                BufferedWriter bw = new BufferedWriter(new FileWriter("file-io-app\\src\\csbcopy.txt"));
                ){

            List<String> list = new ArrayList<>();

            String line;
            while ((line = rd.readLine()) != null){
                list.add(line);
            }

//        2、根据序号排列（自定义字符大小，自定义排序）
            List<String> selfSizes = new ArrayList<>();
            Collections.addAll(selfSizes,"一","二","三","四","五","陆","柒","八","九","十","十一");
            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    // selfSizes.indexOf("一") - selfSizes.indexOf("二");
                    return selfSizes.indexOf(o1.substring(0,o1.indexOf(".")))
                            - selfSizes.indexOf(o2.substring(0,o2.indexOf(".")));
                }
            });
            System.out.println(list);

            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
