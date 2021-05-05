package patterns.状态模式.银行账户状态;

/**
 * 具体状态类
 * <p>
 * Created by WangSai on 2021/5/5
 */
public class OverdraftState extends State{

    public OverdraftState(State accountState) {
        this.account = accountState.account;
    }

    public OverdraftState(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest() {
        System.out.println("计算利息！");

    }

    public void stateCheck() {
        double balance = account.getBalance();
        if (balance > 0) {
            account.setState(new NormalState(this));
        } else if (balance == -2000) {
            account.setState(new RestrictedState(this));
        } else if (balance < 2000) {
            System.out.println("操作受限");
        }

    }
}
