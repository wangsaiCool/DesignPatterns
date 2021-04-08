package patterns.代理模式.静态代理;

/**
 * 业务类
 * <p>
 * Created by WangSai on 2021/4/8
 */
public class AccessValidator {
    public boolean validate(String userName) {
        System.out.println("checking is weather a validate user or not.");
        if ("jack".equalsIgnoreCase(userName)) {
            System.out.println(userName + "is a validate user.");
            return true;
        } else {
            System.out.println(userName + "is an illegal user.");
            return false;
        }
    }
}
