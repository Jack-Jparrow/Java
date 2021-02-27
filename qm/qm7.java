import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 在电商系统中，用户的订单号生成规则是：8位日期（YYYYMMDD）+6位商品ID号+6位随机号。请按规则创建10个商品订单号
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-12 10:31:17
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-16 17:27:36
 */
class Dates{

    public String dates() {
        Date d = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");
        String time = sd.format(d);
        return time;
    }
}

class Id{

    public String sp() {
        String spid = "123456";
        return spid;
    }
}

class Rands{

    public int rands() {
        Random ra =  new Random();
        int a = ra.nextInt(900001) + 100000;
        return a;
    }
}


public class qm7 {

    public static void main(String[] args) {
        Dates d = new Dates();
        Id i = new Id();
        Rands r = new Rands();

        for (int j = 0; j < 10; j++) {
            System.out.println(d.dates() + i.sp() + r.rands());
        }
        
    }
}