package patterns.迭代器模式;

/**
 * Created by WangSai on 2021/4/16
 */
public interface AbstractIterator<T> {
    void next();
    boolean isLast();
    void previous();
    boolean isFirst();
    T getNextItem();
    T getPreItem();
}
