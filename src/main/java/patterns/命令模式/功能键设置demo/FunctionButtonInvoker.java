package patterns.命令模式.功能键设置demo;

/**
 * Created by WangSai on 2021/4/28
 */
public class FunctionButtonInvoker {
    private Command command;
    private String name;

    public FunctionButtonInvoker(String name) {
        this.name = name;
    }

    public void setCommand(Command cmd) {
        this.command = cmd;
    }

    public String getName() {
        return name;
    }

    public void invoke() {
        command.execute();
    }
}
