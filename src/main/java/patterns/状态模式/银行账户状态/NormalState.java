package patterns.状态模式.银行账户状态;

/**
 * 具体状态类
 * <p>
 * Created by WangSai on 2021/5/5
 */
public class NormalState extends State{
    public NormalState(State accountState) {
        this.account = accountState.account;
    }

    public NormalState(Account account) {
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
        System.out.println("正常状态，无需支付利息！");

    }

    public void stateCheck() {
        double balance = account.getBalance();
        if (balance > -2000 && balance <= 0) {
            account.setState(new OverdraftState(this));
        } else if (balance == -2000) {
            account.setState(new RestrictedState(this));
        } else if (balance < -2000){
            System.out.println("操作受限");
        }

    }
}
