package patterns.模板方法模式;

/**
 * Created by WangSai on 2021/4/5
 */
public class SavingAccount extends Account{
    public void calculateInterest() {
        System.out.println("储蓄账户利息计算结果");
    }
}
