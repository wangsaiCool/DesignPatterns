package patterns.状态模式.银行账户状态;

/**
 * 具体状态类
 * <p>
 * Created by WangSai on 2021/5/5
 */
public class RestrictedState extends State {
    public RestrictedState(State accountState) {
        this.account = accountState.account;
    }

    public RestrictedState(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        System.out.println("账号受限，取款失败！");

    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    public void stateCheck() {
        double balance = account.getBalance();

        if (balance > 0) {
            account.setState(new NormalState(this));
        } else if (balance == -2000) {
            account.setState(new OverdraftState(this));
        }
    }
}
