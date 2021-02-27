import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * HashMap
 *
 * @Author: Jack Jparrow
 * @Date: 2020-12-11 10:09:40
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-11 10:42:41
 */

public class QZJT_JAVA_78 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("B", 1);// 添加数据
        map.put("C", 2);
        map.put("D", 1);
        System.out.println(map);

        System.out.println(map.get("B"));// 根据key取值

        map.remove("C");// 根据key删除键值对
        System.out.println(map);

        System.out.println(map.size());// map集合长度

        System.out.println(map.containsKey("B"));// 判断当前map集合是否包含指定key

        System.out.println(map.containsValue(2));// 判断当前map集合是否包含指定value

        // 遍历
        // map.keySet();// 获取集合的key的集合
        // map.values();// 获取集合的values的集合

        // 通过map.keySet()遍历
        Set<String> keys = map.keySet();// 获取集合的key的集合
        // map.values();// 获取集合的所有value值
        for (String key : keys) {
            System.out.println("key: " + key + ", value: " + map.get(key));
        }

        // 通过map.entrySet()遍历
        Set<Entry<String, Integer>> entrys = map.entrySet();
        for (Entry<String, Integer> en : entrys) {
            System.out.println("key: " + en.getKey() + ", value: " + en.getValue());
        }

        map.clear();
        System.out.println(map);

        //TreeMap
        Map<Integer, String> map2 = new TreeMap<>();
        map2.put(4, "d");
        map2.put(1, "a");
        map2.put(3, "b");
        map2.put(2, "c");
        System.out.println(map2);

        Map<String, String> map3 = new TreeMap<>();
        map3.put("a3", "a1");
        map3.put("b1", "a4");
        map3.put("a4", "a2");
        map3.put("a2", "a3");
        System.out.println(map3);
    }
}