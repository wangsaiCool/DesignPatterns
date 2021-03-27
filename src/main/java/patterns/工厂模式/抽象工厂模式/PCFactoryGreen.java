package patterns.工厂模式.抽象工厂模式;

/**
 * 具体工厂PCFactoryBlack
 *
 * Created by WangSai on 2021/3/27
 */
public class PCFactoryGreen implements PCFactory{
    public Mouse createMouse() {
        return new MouseGreen();
    }

    public Keyboard createKeyboard() {
        return new KeyboardGreen();
    }
}
