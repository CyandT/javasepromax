package d2_exception;

public class RunTimeExceptionDemo {
    public static void main(String[] args) {

        System.out.println("程序开始..");
//       1、ArrayIndexOutOfBounds
        int [] arr = {10,20,40};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
//        System.out.println(arr[3]);

//       2、NullPointerException
        String a = null;
        System.out.println(a);
//        System.out.println(a.length());

//       3、ArithmeticException
//        System.out.println(10 / 0);

//       4、ClassCastException
        Object c = "monkey";
//        Integer c1 = (Integer) c;

//        5、NumberFormatException
        String d = "23vvf";
        Integer it = Integer.valueOf(d);
        System.out.println(it);
    }
}
