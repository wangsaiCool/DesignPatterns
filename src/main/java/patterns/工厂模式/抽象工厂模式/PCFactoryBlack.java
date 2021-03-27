package patterns.工厂模式.抽象工厂模式;

/**
 * 具体工厂PCFactoryBlack
 *
 * Created by WangSai on 2021/3/27
 */
public class PCFactoryBlack implements PCFactory{
    public Mouse createMouse() {
        return new MouseBlack();
    }

    public Keyboard createKeyboard() {
        return new KeyboardBlack();
    }
}
