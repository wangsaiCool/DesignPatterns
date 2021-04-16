package patterns.迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangSai on 2021/4/16
 */
public abstract class AbstractList<T> {
    protected List<T> list = new ArrayList<T>();

    public void addObject(T t) {
        list.add(t);
    }

    public void removeObject(T t) {
        list.remove(t);
    }

    public List<T> getObjects() {
        return list;
    }

    // 创建抽象迭代器类
    public abstract AbstractIterator createIterator();
}
