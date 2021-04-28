package patterns.命令模式.计算器界面类设计demo;

/**
 * Created by WangSai on 2021/4/29
 */
public class MainTest {

    public static void main(String[] args) {
        CalculatorForm calculatorForm = new CalculatorForm();

        Command command = new AdderCommand();
        calculatorForm.setCommand(command);

        calculatorForm.compute(2);
        calculatorForm.compute(3);
        calculatorForm.compute(3);
        calculatorForm.compute(1);
        calculatorForm.undo();
    }
}
