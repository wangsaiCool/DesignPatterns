package patterns.外观模式.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 子类系统：文件读取类
 * <p>
 * Created by WangSai on 2021/4/3
 */
public class CustomFileReader {
    public String readFileToString(String path) {
        System.out.println("文件读取");
        try {
            return FileUtils.readFileToString(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

