package patterns.状态模式.银行账户状态;

/**
 * 充当环境类
 * <p>
 * Created by WangSai on 2021/5/5
 */
public class Account {
    private final String ownerName;

    private State state;
    private double balance = 0.0;

    public Account(String ownerName, double init) {
        this.ownerName = ownerName;
        this.balance = init;
        this.state = new NormalState(this);
        System.out.println(this.ownerName + "开户完成，初始金额为：" + init);
        System.out.println("========================================");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void deposit(double amount) {
        System.out.println(this.ownerName + "存款，金额：" + amount);
        state.deposit(amount);
        System.out.println("现在余额为：" + this.balance);
        System.out.println("现在账户状态为：" + this.state.getClass().getName());
        System.out.println("===============================================");
    }

    public void withdraw(double amount) {
        System.out.println(this.ownerName + "取款，金额：" + amount);
        state.withdraw(amount);
        System.out.println("现在余额为：" + this.balance);
        System.out.println("现在账户状态为：" + this.state.getClass().getName());
        System.out.println("===============================================");
    }


    public void computeInterest() {
        state.computeInterest();
    }

}
