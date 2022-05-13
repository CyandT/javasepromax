package d2_api_SimpleDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {
        /**
         * 将系统时间格式化成自己喜欢的格式
         */

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String D =sdf.format(date);
        System.out.println(D);

        long time = System.currentTimeMillis() + 121*1000;
        System.out.println(sdf.format(time));
    }
}
