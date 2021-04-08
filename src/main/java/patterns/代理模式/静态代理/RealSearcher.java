package patterns.代理模式.静态代理;

/**
 * 真实主题类
 * <p>
 * Created by WangSai on 2021/4/8
 */
public class RealSearcher implements Searcher {
    public String doSearch(String userName, String keyword) {
        String msg = userName + " is searching "+ keyword;
        System.out.println(msg);
        return msg;
    }
}
