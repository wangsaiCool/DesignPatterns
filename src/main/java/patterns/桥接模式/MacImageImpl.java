package patterns.桥接模式;

/**
 * Created by WangSai on 2021/5/8
 */
public class MacImageImpl implements ImageImp {
    public void doPaint(Matrix m) {
        // 模拟调用系统函数绘制像素矩阵，展示图片
        System.out.println("在Mac中显示图片");
    }
}
