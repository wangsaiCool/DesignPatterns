package patterns.命令模式.功能键设置demo;

/**
 * Created by WangSai on 2021/4/28
 */
public class MainTest {

    public static void main(String[] args) {

        FunctionButtonSettingWindow window = new FunctionButtonSettingWindow("测试窗口");

        MinimizeCommand minimizeCommand = new MinimizeCommand();
        FunctionButtonInvoker minimizeButton = new FunctionButtonInvoker("最小化窗口按键");
        minimizeButton.setCommand(minimizeCommand);
        window.addFunctionButton(minimizeButton);

        HelpCommand helpCommand = new HelpCommand();
        FunctionButtonInvoker helpButton= new FunctionButtonInvoker("显示帮助文档按键");
        helpButton.setCommand(helpCommand);
        window.addFunctionButton(helpButton);

        window.display();
    }
}
