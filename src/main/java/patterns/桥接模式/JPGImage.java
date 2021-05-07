package patterns.桥接模式;

/**
 * Created by WangSai on 2021/5/8
 */
public class JPGImage extends Image{
    public void parseImage(String fileName) {
        // 模拟解析图像文件，并获得Matrix对象
        Matrix matrix = new Matrix();
        imageImp.doPaint(matrix);
        System.out.println(fileName + ", 格式为：JPG.");
    }
}
