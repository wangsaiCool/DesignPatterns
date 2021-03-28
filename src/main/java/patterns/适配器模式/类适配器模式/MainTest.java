package patterns.适配器模式.类适配器模式;

/**
 * Created by WangSai on 2021/3/28
 */
public class MainTest {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}
