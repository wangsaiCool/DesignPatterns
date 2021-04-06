package patterns.观察者模式.JDK提供的类;

/**
 * Created by WangSai on 2021/4/6
 */
public class MainTest {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver o1 = new ConcreteObserver("o1");
        ConcreteObserver o2 = new ConcreteObserver("o2");
        ConcreteObserver o3 = new ConcreteObserver("o3");

        subject.addObserver(o1);
        subject.addObserver(o2);
        subject.addObserver(o3);

        o1.setName("test ");
        System.out.println(subject.hasChanged());
        subject.setChanged();
        System.out.println(subject.hasChanged());
        subject.notifyObservers();
        System.out.println(subject.countObservers());
    }
}
