package d3_regex;

import java.util.Scanner;

/**
 * 正则表达式的使用和案例
 * 检验客户的手机号码，邮箱，和电话号码是否正确
 */
public class RegexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //phone(sc);
        email(sc);
    }
    public static void phone(Scanner sc){
        while (true) {
            System.out.println("请输入您的手机号码:");
            String phone  = sc.next();
            //  phone: 13549871161
            if(phone.matches("1[3-9]\\d{9}")){
                System.out.println("格式正确~成功注册!");
                break;
            }else {
                System.out.println("您的格式不正确,请重新输入~");
            }
        }
    }
    public static void email(Scanner sc){
        while (true) {
            System.out.println("请输入您的email:");
            String email  = sc.next();
            if(email.matches("\\w{3,15}@\\w{2,5}(\\.\\w{2,6}){1,2}")){
                System.out.println("格式正确~成功注册!");
                break;
            }else {
                System.out.println("您的格式不正确,请重新输入~");
            }
        }
    }
}
