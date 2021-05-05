package patterns.状态模式.银行账户状态;

/**
 * Created by WangSai on 2021/5/5
 */
public class MockClientTest {

    public static void main(String[] args) {
        Account account = new Account("岳云鹏", 0.0);
        account.deposit(1000);
        account.withdraw(1000);
        account.deposit(10);

        account.computeInterest();
    }
}
