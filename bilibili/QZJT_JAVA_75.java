import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * TreeSet
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-09 09:18:32
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-09 09:23:19
 */

public class QZJT_JAVA_75 {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(2);
        set.add(3);
        set.add(-9);
        System.out.println(set);

        set.remove(3);
        System.out.println(set);

        System.out.println(set.contains(0));

        // 使用迭代器遍历集合
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("=====================");

        // for each迭代集合（推荐）
        for (Object obj : set) {// 吧set的每一个值取出来，赋值给obj，直到循环set的所有值
            System.out.println(obj);
        }

        set.clear();
        System.out.println(set);
    }
}