package patterns.命令模式.计算器界面类设计demo;

/**
 * Created by WangSai on 2021/4/28
 */
public class AdderReceiver {
    private int sum = 0;

    public int add(int value) {
        return sum += value;
    }
}
