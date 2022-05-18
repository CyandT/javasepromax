package d4_Array;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayDemo {
    public static void main(String[] args) {
        int []arr = {11,55,23,69,84,45};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,69);
        System.out.println("69在第" + index + "位");
/**
 * 倒序
 * 只支持引用类型
 */
        Integer []arr1 = {11,55,23,69,84,45};
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
}
