package indi.cola.d2_test;

import java.util.Random;

public class YanZhenGUtil {
    private YanZhenGUtil(){
    }


    public static String YanZ(int n){
        String code="";
        String codeTotal = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789";

        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(codeTotal.length());
            code += codeTotal.charAt(index);
        }
        return code;
    }
}
