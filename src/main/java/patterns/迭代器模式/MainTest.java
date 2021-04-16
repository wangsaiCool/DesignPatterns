package patterns.迭代器模式;

/**
 * Created by WangSai on 2021/4/16
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractList<String> list = new ConcreteList<String>();
        list.addObject("海淀");
        list.addObject("朝阳");
        list.addObject("崇文区");
        list.addObject("宣武区");

        AbstractIterator iterator = list.createIterator();

        System.out.println("=======正向遍历========");
        while (!iterator.isLast()) {
            String nextItem = (String) iterator.getNextItem();
            iterator.next();
            System.out.println(nextItem);

        }

        System.out.println("=======逆向遍历========");

        while (!iterator.isFirst()) {
            String pre = (String) iterator.getPreItem();
            System.out.println(pre);
            iterator.previous();

        }
    }
}
