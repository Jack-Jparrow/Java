import java.util.ArrayList;
import java.util.List;

/**
 * 泛型
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-11 14:10:35
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-11 14:15:23
 */

public class QZJT_JAVA_80 {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(111);
        list.add("e");
        list.add(true);

        // 需求：只能在集合中有字符串
        // 用泛型↓
        List<String> list2 = new ArrayList<>();
        list2.add("e");
        // list2.add(2);//编译期就发生错误
    }
}