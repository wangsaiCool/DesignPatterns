package patterns.桥接模式;

/**
 * 抽象操作系统显示类，操作系统负责完成图片的绘制
 * <p>
 * Created by WangSai on 2021/5/7
 */
public interface ImageImp {
    public void doPaint(Matrix m);
}
