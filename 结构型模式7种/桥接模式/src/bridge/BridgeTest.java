package bridge;

/**
 * @Author: westlife
 * @Description:
 * @Date: Created in 14:59 2017/12/27
 * 这样，就通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用
 */
public class BridgeTest {
    public static void main(String[] args) {

        Bridge bridge = new MyBridge();

        /*调用第一个对象*/
        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        /*调用第二个对象*/
        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
