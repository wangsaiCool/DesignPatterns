package patterns.观察者模式.JDK提供的类;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by WangSai on 2021/4/6
 */
public class ConcreteObserver implements Observer {

    public ConcreteObserver(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        System.out.println("ConcreteObserver update " + this.name + "success.");
    }
}
