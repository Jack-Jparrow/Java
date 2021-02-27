/**
 * 异常-空指针
 *
 * @Author: Jack Jparrow
 * @Date: 2021-01-16 15:46:54
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-16 15:49:33
 */

class A_86 {
    int i;
}

public class QZJT_JAVA_86 {

    public static void main(String[] args) {
        // A_86 a = new A_86();
        A_86 a = null;// 没有指向任何对象，指向null，什么都没有
        System.out.println(a.i);
    }
}