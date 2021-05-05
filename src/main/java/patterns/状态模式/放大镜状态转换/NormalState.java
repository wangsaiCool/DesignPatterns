package patterns.状态模式.放大镜状态转换;

/**
 * 具体状态类
 * <p>
 * Created by WangSai on 2021/5/5
 */
public class NormalState extends State {

    public void display() {
        System.out.println("正常放大倍数");
    }
}
