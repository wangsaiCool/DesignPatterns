package patterns.模板方法模式;

/**
 * 抽象用户类: 账户类
 * <p>
 * Created by WangSai on 2021/4/5
 */
public abstract class Account {
    // 具体方法
    public boolean validate(String account, String password) {
        System.out.println("account:" + account);
        System.out.println("password:" + password);
        return "jack".equalsIgnoreCase(account) && "123".equalsIgnoreCase(password);
    }

    // 抽象方法
    public abstract void calculateInterest();


    // 具体方法
    public void display() {
        System.out.println("显示利息");
    }

    // 模板方法
    public void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("invalid account, pls check.");
            return;
        }
        calculateInterest();
        display();

    }
}
