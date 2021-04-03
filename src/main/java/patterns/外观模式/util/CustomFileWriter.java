package patterns.外观模式.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 子类系统：文件保存类
 * <p>
 * Created by WangSai on 2021/4/3
 */
public class CustomFileWriter {
    public void writeStringToFile(String path, String content) {
        System.out.println("文件保存");
        try {
            FileUtils.writeStringToFile(new File(path), content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
