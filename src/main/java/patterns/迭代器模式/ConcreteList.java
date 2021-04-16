package patterns.迭代器模式;

import java.util.List;

/**
 * Created by WangSai on 2021/4/16
 */
public class ConcreteList<T> extends AbstractList {

    public AbstractIterator<T> createIterator() {
        return new ConcreteIterator(this);
    }

}
