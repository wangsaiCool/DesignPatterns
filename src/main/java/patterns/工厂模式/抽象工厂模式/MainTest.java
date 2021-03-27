package patterns.工厂模式.抽象工厂模式;

import utils.XMLUtil;

/**
 * Created by WangSai on 2021/3/27
 */
public class MainTest {
    // 模拟调用方使用
    public static void main(String[] args) throws Exception {
        // 针对抽象工厂编程，黑色PC工厂
        PCFactory pcFactory = new PCFactoryBlack();

        // 针对抽象产品编程，初始化黑色键盘
        Keyboard keyboard = pcFactory.createKeyboard();
        keyboard.display();

        // 针对抽象产品编程，初始化黑色鼠标
        Mouse mouse = pcFactory.createMouse();
        mouse.click();

        // 使用xml指定初始化绿色PC工厂
        String factoryKey = "abstractFactory";
        pcFactory = (PCFactory) XMLUtil.getBean(factoryKey);

        keyboard = pcFactory.createKeyboard();
        keyboard.display();
        mouse = pcFactory.createMouse();
        mouse.click();

    }


}
