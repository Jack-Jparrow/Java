import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 在电商系统中，用户的订单号生成规则是：8位日期（YYYYMMDD）+6位商品ID号+6位随机号。请按规则创建10个商品订单号
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-16 17:21:23 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-17 18:13:39
 */
class Dates7_1{
    public String getDates(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String dates = sdf.format(d);
        return dates;
    }

}

class Id7_1{

    public int getId() {
        int i = 123456;
        return i;
    }

}

class Rands7_1{

    public int rand() {
        Random r = new Random();
        int rands = r.nextInt(900001) + 100000;
        return rands;
    }

}

public class qm7_1 {

    public static void main(String[] args) {
        Dates7_1 d = new Dates7_1();
        Id7_1 id = new Id7_1();
        Rands7_1 ra = new Rands7_1();
        
        for (int i = 0; i < 10; i++) {
            System.out.println(d.getDates() + id.getId() + ra.rand());
        }
    }
}