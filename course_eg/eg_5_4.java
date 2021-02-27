
/**
 * 书p145，eg5-12
 *
 * @Author: Jack Jparrow 
 * @Date: 2020-12-05 19:51:17 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2020-12-05 20:02:28
 */

import java.util.*;

public class eg_5_4 {
    public static void main(String args[]) {
        Set<String> s = new HashSet<>();

        for (String a : args) {
            if (!s.add(a)) {
                System.out.println("Duplicate detected: " + a);
            }
        }

        System.out.println(s.size() + " distinct words detected: " + s);
    }
}
