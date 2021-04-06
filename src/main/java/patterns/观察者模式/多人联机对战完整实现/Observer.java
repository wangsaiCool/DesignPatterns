package patterns.观察者模式.多人联机对战完整实现;

/**
 * 抽象观察者类
 * <p>
 * Created by WangSai on 2021/4/6
 */
public interface Observer {
    public String getName();

    public void setName(String name);

    public void help();

    public void beAttacked(AllyControlCenter allyControlCenter);
}
