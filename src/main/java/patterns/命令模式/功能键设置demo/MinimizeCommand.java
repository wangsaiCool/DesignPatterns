package patterns.命令模式.功能键设置demo;

/**
 * Created by WangSai on 2021/4/28
 */
public class MinimizeCommand implements Command {
    private MinimizeHandleReceiver receiver;

    public MinimizeCommand() {
        receiver = new MinimizeHandleReceiver();
    }

    public void execute() {
        receiver.minimize();
    }

}
