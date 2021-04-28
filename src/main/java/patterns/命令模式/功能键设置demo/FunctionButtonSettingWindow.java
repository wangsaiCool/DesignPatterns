package patterns.命令模式.功能键设置demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangSai on 2021/4/28
 */
public class FunctionButtonSettingWindow {
    private String title;
    private List<FunctionButtonInvoker> list = new ArrayList<FunctionButtonInvoker>();

    public FunctionButtonSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButtonInvoker buttonInvoker) {
        list.add(buttonInvoker);
    }

    public void removeFunctionButton(FunctionButtonInvoker buttonInvoker) {
        list.remove(buttonInvoker);
    }

    public void display() {
        System.out.println("显示窗口：" + title);
        System.out.println("显示功能键：");
        for (FunctionButtonInvoker buttonInvoker : list) {
            String name = buttonInvoker.getName();
            System.out.println(name);
            buttonInvoker.invoke();
        }

    }
}
