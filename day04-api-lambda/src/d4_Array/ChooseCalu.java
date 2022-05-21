package d4_Array;
/**
 * 选择排序算法
 */

import java.util.Arrays;

public class ChooseCalu {
    public static void main(String[] args) {
        int []arr= {11,55,23,69,84,45};
        //           0  1  2  3  4  5

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
            }
        }}
        String rs = Arrays.toString(arr);
        System.out.println("选择排序的结果是:"+rs);

}}
