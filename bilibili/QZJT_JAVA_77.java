import java.util.ArrayList;
import java.util.List;

/**
 * List
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-10 20:14:49
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-10 20:34:52
 */

public class QZJT_JAVA_77 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("v");
        list.add("b");
        list.add("d");
        list.add("d");
        System.out.println(list);
        System.out.println(list.get(2));

        list.add(1, "f");
        System.out.println(list);

        List<String> list2 = new ArrayList<>();

        list2.add("123");
        list2.add("456");
        list.addAll(2, list2);
        System.out.println(list);

        System.out.println(list.indexOf("d"));// 获取指定元素第一次出现的索引下标
        System.out.println(list.lastIndexOf("d"));// 获取指定元素最后一次出现的索引下标

        list.remove(2);
        System.out.println(list);

        list.set(1, "ff");// 根据指定元素的下标修改元素
        System.out.println(list);

        List<String> list3 = list.subList(2, 5);// 根据指定索引下标的起始位置截取元素
        System.out.println(list3);// 左闭右开

        System.out.println(list.size());
    }
}