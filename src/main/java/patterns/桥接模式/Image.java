package patterns.桥接模式;

/**
 * 抽象图像类，业务和这个类打交道比较多
 * <p>
 * Created by WangSai on 2021/5/7
 */
public abstract class Image {
    protected ImageImp imageImp;

    public ImageImp getImageImp() {
        return imageImp;
    }

    public void setImageImp(ImageImp imageImp) {
        this.imageImp = imageImp;
    }

    public abstract void parseImage(String fileName);
}
