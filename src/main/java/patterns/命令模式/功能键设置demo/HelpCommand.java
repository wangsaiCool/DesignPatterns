package patterns.命令模式.功能键设置demo;

/**
 * Created by WangSai on 2021/4/28
 */
public class HelpCommand implements Command{
    private HelpHandleReceiver receiver;

    public HelpCommand() {
        receiver = new HelpHandleReceiver();
    }

    public void execute() {
        receiver.display();
    }
}
