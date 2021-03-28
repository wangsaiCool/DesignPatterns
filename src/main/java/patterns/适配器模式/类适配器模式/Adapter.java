package patterns.适配器模式.类适配器模式;

/**
 * 适配器类
 * <p>
 * Created by WangSai on 2021/3/28
 */
public class Adapter extends Adaptee implements Target {

    public void request() {
        super.specificRequest();
    }
}
