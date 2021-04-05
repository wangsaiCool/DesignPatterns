package patterns.模板方法模式;

/**
 * 活期账户类
 * <p>
 * Created by WangSai on 2021/4/5
 */
public class CurrentAccount extends Account {
    public void calculateInterest() {
        System.out.println("按照活期账户计算利息");
    }
}
