package patterns.外观模式;

import patterns.外观模式.util.CustomFileReader;
import patterns.外观模式.util.CustomFileWriter;
import patterns.外观模式.util.SimpleCipherMachine;

/**
 * Created by WangSai on 2021/4/3
 */
public class SimpleEncryptFacade implements AbstractEncryptFacade{

    // 维持对子系统的引用
    private CustomFileReader reader;
    private CustomFileWriter writer;
    private SimpleCipherMachine cipherMachine;

    public SimpleEncryptFacade() {
        reader = new CustomFileReader();
        writer = new CustomFileWriter();
        cipherMachine = new SimpleCipherMachine();
    }

    public void encrypt(String plainFilePath, String cipherFilePath) {
        String plainContent = reader.readFileToString(plainFilePath);
        String cipherContent = cipherMachine.encrypt(plainContent);
        writer.writeStringToFile(cipherFilePath, cipherContent);
    }
}
