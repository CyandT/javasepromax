package file;

/**
 * 学习递归算法
 * 递归三大要素: 1、递归的公式 2、递归的终结点 3、递归的方向必须走向终结点
 */
public class Recursion {
    public static void main(String[] args) {

        int n = f(1);
        System.out.println(n);

    }
    public static int f(int n){
        if(n == 10){
            return 1;
        }else {
            return 2*f(n + 1) + 2;
        }
    }
}
