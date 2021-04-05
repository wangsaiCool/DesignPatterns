package patterns.模板方法模式;

import utils.XMLUtil;

/**
 * Created by WangSai on 2021/4/5
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        Account account = (Account) XMLUtil.getBean("templateMethodPattern");

        account.handle("jack", "123");
    }
}
