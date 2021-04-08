package patterns.代理模式.静态代理;

/**
 * 代理主题类
 * <p>
 * Created by WangSai on 2021/4/8
 */
public class ProxySearcher implements Searcher {
    private static final Logger logger = new Logger();
    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator validator = new AccessValidator();

    public String doSearch(String userName, String password) {
        if (validator.validate(userName)) {
            logger.log(userName + ", is validate user, and then do search");
            return realSearcher.doSearch(userName, password);
        } else {
            logger.log(userName + ", illegal validate user.");
            return null;
        }
    }
}
