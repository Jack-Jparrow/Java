import java.util.ArrayList;
import java.util.List;

/**
 * 注解
 *
 * @Author: Jack Jparrow
 * @Date: 2021-01-28 10:36:44
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-28 11:02:25
 */

class TestA_95 {
    public void test_95() {
        // TODO Auto-generated method stub
    }
}

class TestB_95 extends TestA_95 {

    @Override
    public void test_95() {
        // TODO Auto-generated method stub
        super.test_95();
    }

    /**
    * @deprecated (no)
    */
    @Deprecated(since="")
    public void test1_95(){
        // TODO Auto-generated method stub
    }
    
}

public class QZJT_JAVA_95 {

    public static void main(String[] args) {
        new TestB_95().test1_95();

        @SuppressWarnings({"rawtypes", "unused"})
        List list = new ArrayList<>();

    }
}
