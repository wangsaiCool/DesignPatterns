package utils;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by WangSai on 2021/3/27
 */
public class XMLUtil {
    private static final String CONFIG_PATH = "src/main/resources/pattern_design.xml";

    public static Object getBean(String className) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(CONFIG_PATH);
        NodeList elements = document.getElementsByTagName(className);
        String cName = elements.item(0).getFirstChild().getNodeValue();

        // 反射
        return Class.forName(cName).newInstance();
    }

}
