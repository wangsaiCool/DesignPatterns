package patterns.外观模式;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by WangSai on 2021/4/3
 */
public class AbstractEncryptFacadeTest {

    @Test
    public void encrypt() throws IOException {
        // 依赖倒转， 针对抽象的Facade编程
        AbstractEncryptFacade encryptFacade = new SimpleEncryptFacade();
        String plainFile = "/tmp/plain.txt";
        String cipherFile = "/tmp/cipher.txt";
        FileUtils.writeStringToFile(new File(plainFile), "hello, it is a test message");
        encryptFacade.encrypt(plainFile, cipherFile);
    }
}