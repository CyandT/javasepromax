package d1_api_date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //1.得出当前的时间
        Date time = new Date();
        System.out.println("此刻的时间是:"+ time);

        long time1 = time.getTime();
        System.out.println(time1);
        Date date = new Date(time1);
        System.out.println(date);

        /**
         * 计算当前时间往后走1个小时121秒的时间
         */
        //2.得出走完一个小时121秒后的毫秒值
        long time2 = System.currentTimeMillis();
        time2 += (60*60 + 121)*1000;

        //3.将计算后的时间打印出
        Date time3 = new Date(time2);
        System.out.println("计算后的时间是:"+time3);
    }
}
