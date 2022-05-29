package d5_lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda_demo1 {
    public static void main(String[] args) {
        Integer[] arr = {12,55,66,42,1};
        Arrays.sort(arr,(o1, o2)-> o2 - o1);
        System.out.println(Arrays.toString(arr));
    }
}
