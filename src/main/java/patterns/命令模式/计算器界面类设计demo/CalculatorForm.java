package patterns.命令模式.计算器界面类设计demo;

/**
 * Created by WangSai on 2021/4/28
 */
public class CalculatorForm {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void compute(int value) {
        System.out.println("计算结果：" + command.execute(value));
    }

    public void undo() {
        System.out.println("执行撤销，运算结果为：" + command.undo());
    }
}
