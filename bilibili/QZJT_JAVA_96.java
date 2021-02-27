import java.util.ArrayList;
import java.util.List;

/**
 * 自定义Annotation
 *
 * @Author: Jack Jparrow 
 * @Date: 2021-01-28 15:23:31 
 * @Last Modified by: Jack Jparrow
 * @Last Modified time: 2021-01-28 15:25:06
 */

class TestA_96 {
    public void test_96() {
        // TODO Auto-generated method stub
    }
}

class TestB_96 extends TestA_96 {

    @Override
    public void test_96() {
        // TODO Auto-generated method stub
        super.test_96();
    }

    /**
    * @deprecated (no)
    */
    @Deprecated(since="")
    public void test1_96(){
        // TODO Auto-generated method stub
    }
    
}

public class QZJT_JAVA_96 {

    public static void main(String[] args) {
        new TestB_96().test1_96();

        @SuppressWarnings({"rawtypes", "unused"})
        List list = new ArrayList<>();

    }
}

