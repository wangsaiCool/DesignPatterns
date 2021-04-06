package patterns.观察者模式.JDK提供的类;

import java.util.Observable;

/**
 * Created by WangSai on 2021/4/6
 */
public class ConcreteSubject extends Observable {
    public synchronized void setChanged() {
        super.setChanged();
    }

    /**
     * Indicates that this object has no longer changed, or that it has
     * already notified all of its observers of its most recent change,
     * so that the <tt>hasChanged</tt> method will now return <tt>false</tt>.
     * This method is called automatically by the
     * <code>notifyObservers</code> methods.
     *
     * @see     java.util.Observable#notifyObservers()
     * @see     java.util.Observable#notifyObservers(java.lang.Object)
     */
    protected synchronized void clearChanged() {
        super.clearChanged();
    }

}
