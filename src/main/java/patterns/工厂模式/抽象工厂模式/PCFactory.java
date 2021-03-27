package patterns.工厂模式.抽象工厂模式;

/**
 * 抽象工厂PCFactory
 * <p>
 * Created by WangSai on 2021/3/27
 */
public interface PCFactory {
    // 接口针对抽象Mouse编程
    public Mouse createMouse();
    // 接口针对抽象Keyboard编程
    public Keyboard createKeyboard();
}
