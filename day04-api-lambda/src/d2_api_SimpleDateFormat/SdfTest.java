package d2_api_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 判断是否中奖
 */
public class SdfTest {
    public static void main(String[] args) throws ParseException {
        //1、开始时间，结束时间
        String startTime = "2020年11月11日 0:0:0";
        String endTime = "2020年11月11日 0:10:0";

        //2、下单时间
        String xiaoJia = "2020年11月11日 0:03:47";
        String xiaoPi = "2020年11月11日 0:10:11";

        //3、解析时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        Date d3 = sdf.parse(xiaoJia);
        Date d4 = sdf.parse(xiaoPi);

        //4.比较
        if(d3.after(d1) && d3.before(d2)){
            System.out.println("恭喜小贾中奖~");
        }else {
            System.out.println("很可惜,未中奖~");
        }

        if(d4.after(d1) && d4.before(d2)){
            System.out.println("恭喜小皮中奖~");
        }else {
            System.out.println("很可惜,未中奖~");
        }
    }
}
