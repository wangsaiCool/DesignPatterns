package patterns.组合模式.透明组合模式;

/**
 * Created by WangSai on 2021/4/20
 */
public abstract class AbstractFile {

    public void add(AbstractFile abstractFile) {
        System.out.println("不支持该方法");

    }

    public void remove(AbstractFile abstractFile) {
        System.out.println("不支持该方法");
    }

    public AbstractFile getChild(int i) {
        System.out.println("不支持该方法");
        return null;
    }

    public abstract void killVirus();
}
