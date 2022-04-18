package indi.cola.d2_test;

public class ArrayUtil {
    //将构造器私有,不使用对象
    private ArrayUtil(){

    }
    //使用静态方法
    public static String toString(int[] arr){
        if(arr == null){
            return null;
        }
         //拼接内容
        String tool = "[";
        for (int i = 0; i < arr.length; i++) {
            tool += (i == arr.length-1?arr[i]:arr[i]+", ");
        }
        tool += "]";
        return tool;
    }
}
