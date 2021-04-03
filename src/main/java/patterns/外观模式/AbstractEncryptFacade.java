package patterns.外观模式;

/**
 * 抽象外观模式的接口
 * <p>
 * Created by WangSai on 2021/4/3
 */
public interface AbstractEncryptFacade {

    public void encrypt(String plainFile, String cipherFile);
}
