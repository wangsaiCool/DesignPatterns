package patterns.外观模式.util;

/**
 * 子类系统：文件加密类
 * <p>
 * Created by WangSai on 2021/4/3
 */
public class SimpleCipherMachine {
    private static final int SPLIT_LEN = 8;

    public String encrypt(String plainText) {
        System.out.println("文件加密");
        StringBuilder sb = new StringBuilder();

        int count = 0;
        for (; count < plainText.length(); count += SPLIT_LEN) {
            if (count + SPLIT_LEN >= plainText.length()) {
                break;
            }
            sb.append(plainText, count + SPLIT_LEN / 2, count + SPLIT_LEN);
            sb.append(plainText, count, count + SPLIT_LEN / 2);
        }
        sb.append(plainText.substring(count));
        return sb.toString();
    }
}
