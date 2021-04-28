package patterns.命令模式.计算器界面类设计demo;

/**
 * Created by WangSai on 2021/4/28
 */
public interface Command {
    public int execute(int value);

    public int undo();
}
