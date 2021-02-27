/**
 * ==和equals
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-05 08:36:59
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-05 09:34:26
 */
class Order {
    public Order(int orderID, String orderName) {
        this.orderID = orderID;
        this.orderName = orderName;
    }

    int orderID;
    String orderName;

    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        if (obj instanceof Order) {
            Order o = (Order) obj;

            if (this.orderID == o.orderID && this.orderName.equals(o.orderName)) {
                flag = true;
            }
        }
        return flag;
    }

}

public class QZJT_JAVA_56 {

    public static void main(String[] args) {
        Order o1 = new Order(123, "abc");
        Order o2 = new Order(123, "abc");

        System.out.println(o1.equals(o2));
    }
}
