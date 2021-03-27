package patterns.工厂模式.工厂方法模式;

import utils.XMLUtil;

/**
 * Created by WangSai on 2021/3/26
 */
public class MainTest {
    public static void main(String[] args) throws Exception {
        String loggerFactory = "methodFactory";
        LoggerFactory factory = (LoggerFactory) XMLUtil.getBean(loggerFactory);

        Logger logger = factory.createLogger();
        logger.writeLog("it is a test");
    }
}
