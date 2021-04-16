package patterns.迭代器模式;

import java.util.List;

/**
 * Created by WangSai on 2021/4/16
 */
public class ConcreteIterator<T> implements AbstractIterator {
    private final AbstractList<T> abstractList;
    private final List<T> objectsList;
    private int cursor1;
    private int cursor2;

    public ConcreteIterator(AbstractList<T> list) {
        this.abstractList = list;
        this.objectsList = abstractList.getObjects();
        cursor1 = 0;
        cursor2 = objectsList.size() - 1;
    }

    public void next() {
        if (cursor1 < objectsList.size()) {
            cursor1++;
        }
    }

    public boolean isLast() {
        return cursor1 == objectsList.size();
    }

    public void previous() {
        if (cursor2 > -1) {
            cursor2--;
        }
    }

    public boolean isFirst() {
        return cursor2 == -1;
    }

    public Object getNextItem() {
        return objectsList.get(cursor1);
    }

    public Object getPreItem() {
        return objectsList.get(cursor2);
    }
}
