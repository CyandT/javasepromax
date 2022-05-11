package d15_api_system;

import java.util.Arrays;

/**
 * API-SYSTEM
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 数组拷贝
         * public static native void arraycopy(Object src,  int  srcPos,
         *                                         Object dest, int destPos,
         *                                         int length);
         * 1.参数一：被拷贝数组
         * 2.参数二：从第几个元素开始拷贝
         * 3.参数三：拷贝数组
         * 4.参数四：粘贴到第几个位置
         * 5.参数四：拷贝的元素个数
         */
        int [] arr1 = {11,66,88,44,99,23,75};
        int [] arr2 = new int[6];  // 0, 0, 44, 99, 23, 0

        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println(Arrays.toString(arr2));// 遍历
    }
}
