package patterns.职责链模式;

/**
 * Created by WangSai on 2021/5/1
 */
public class MockClientTest {
    public static void main(String[] args) {
        // 由client完成职责链的建链
        Request request = new Request(783300.20, 20210501, "五一劳动节福利费");

        Handler directorHandler = new DirectorHandler("郭靖");
        Handler presidentHandler = new PresidentHandler("黄蓉");
        Handler congressHandler = new CongressHandler("华山论剑董事会");

        directorHandler.setSuccessor(presidentHandler);
        presidentHandler.setSuccessor(congressHandler);

        directorHandler.processRequest(request);
    }
}
