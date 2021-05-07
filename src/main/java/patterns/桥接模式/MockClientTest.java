package patterns.桥接模式;

/**
 * Created by WangSai on 2021/5/8
 */
public class MockClientTest {
    public static void main(String[] args) {
        String fileName = "image_file";
        Image image = new GIFImage();
        image.setImageImp(new MacImageImpl());
        image.parseImage(fileName);
        System.out.println("==============");

        image.setImageImp(new LinuxImageImpl());
        image.parseImage(fileName);
        System.out.println("==============");

        image.setImageImp(new WindowsImageImpl());
        image.parseImage(fileName);
        System.out.println("==============");
    }
}
