package d2_api_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        /**
         * 解析字符串时间
         */

        String time = "2022-5-13 15:25:54 周六 下午";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        Date date = sdf.parse(time);

        long time1 = date.getTime() + 60*60*1000;
        System.out.println(sdf.format(time1));
    }
}
