import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * HashSet
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-08 10:47:45
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-09 09:14:31
 */

public class QZJT_JAVA_74 {

    public static void main(String[] args) {
        Set set = new HashSet<>();// ==Set<Object> set = new HashSet<>();

        set.add(1);// 添加元素
        set.add("a");
        System.out.println(set);

        set.remove(1);// 移除元素
        System.out.println(set);

        System.out.println(set.contains("a"));// 判断有没有这个值

        set.clear();// 清空
        System.out.println(set);

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add(null);
        set.add(true);
        System.out.println(set);

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

        System.out.println("=====================");

        // 集合大小
        System.out.println(set.size());

        // 泛型
        Set<String> set1 = new HashSet<>();// 指定String为集合的泛型，不能存其他类型
        set1.add("e");
        // set1.add(1);
    }
}