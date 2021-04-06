package patterns.观察者模式.多人联机对战完整实现;

/**
 * 具体观察者类
 * <p>
 * Created by WangSai on 2021/4/6
 */
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void help() {
        System.out.printf("我，{%s}，来救你了! 坚持住！\n", this.name);
        System.out.println("_______________________");
    }

    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(this.name +"被攻击");
        allyControlCenter.notifyObserver(this.name);

    }
}
