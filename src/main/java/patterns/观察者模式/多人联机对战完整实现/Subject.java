package patterns.观察者模式.多人联机对战完整实现;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangSai on 2021/4/6
 */
public abstract class Subject {
    protected String allyName;

    public Subject(String allyName) {
        this.allyName = allyName;
    }

    protected List<Observer> observers = new ArrayList<Observer>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    // 注册到目标中心
    public void join(Observer observer) {
        System.out.println(observer.getName() + ", 加入" + this.allyName + "战队");
        observers.add(observer);
    }

    // 从目标中心注销
    public void quit(Observer observer) {
        System.out.println(observer.getName() + ", 退出" + this.allyName + "战队");
        observers.remove(observer);
    }

    // 抽象通知方法
    public abstract void notifyObserver(String allyName);
}
