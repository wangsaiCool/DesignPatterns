package patterns.工厂模式.抽象工厂模式;

/**
 * 具体产品MouseGreen
 * <p>
 * Created by WangSai on 2021/3/27
 */
public class MouseGreen implements Mouse {
    public void click() {
        System.out.println("click GreenMouse");
    }
}