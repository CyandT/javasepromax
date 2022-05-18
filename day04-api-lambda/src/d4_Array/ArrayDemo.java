package d4_Array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] arr = {11, 55, 23, 89};
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr,55);
        System.out.println(index);
    }
}
