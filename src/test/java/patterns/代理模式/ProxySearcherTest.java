package patterns.代理模式;

import org.junit.Test;
import patterns.代理模式.静态代理.ProxySearcher;
import patterns.代理模式.静态代理.Searcher;

/**
 * Created by WangSai on 2021/4/8
 */
public class ProxySearcherTest {

    @Test
    public void doSearch() {
        Searcher searcher = new ProxySearcher();
        String result = searcher.doSearch("jack", "rose");
        System.out.println("search result:" + result);

    }
}