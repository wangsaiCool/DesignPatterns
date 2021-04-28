package patterns.命令模式.计算器界面类设计demo;

/**
 * Created by WangSai on 2021/4/28
 */
public class AdderCommand implements Command{
    private AdderReceiver receiver;
    private int value;

    public AdderCommand() {
        receiver = new AdderReceiver();
    }

    public void setReceiver(AdderReceiver receiver) {
        this.receiver = receiver;
    }

    public int execute(int value) {
        this.value = value;
        return receiver.add(value);
    }

    public int undo() {
        return receiver.add(-value);
    }

}
