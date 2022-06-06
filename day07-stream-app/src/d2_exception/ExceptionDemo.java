package d2_exception;

import java.util.Scanner;

/**
 * 死循环输入价格，判断异常，正确停止
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("请输入合适的价格 :");

                String str = sc.nextLine();
                Double price = Double.valueOf(str);

                if(price>=0){
                    System.out.println("您输入的价格是正确的~");
                    break;
                }else {
                    System.out.println("对不起!请重新输入价格!");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
