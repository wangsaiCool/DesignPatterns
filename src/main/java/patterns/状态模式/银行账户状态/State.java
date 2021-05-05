package patterns.状态模式.银行账户状态;

/**
 * 状态类， 由状态类来做状态的管理
 * <p>
 * Created by WangSai on 2021/5/5
 */
public abstract class State {
    protected Account account;

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void computeInterest();

    public abstract void stateCheck();

}
