package patterns.观察者模式.多人联机对战完整实现;

/**
 * Created by WangSai on 2021/4/6
 */
public class MainTest {
    public static void main(String[] args) {
        AllyControlCenter allyControlCenter = new AllyControlCenter("召唤师峡谷");
        Player p1 = new Player("德玛西亚");
        Player p2 = new Player("阿狸");
        Player p3 = new Player("波比");
        Player p4 = new Player("皮城女警");
        Player p5 = new Player("莫甘娜");

        allyControlCenter.join(p1);
        allyControlCenter.join(p2);
        allyControlCenter.join(p3);
        allyControlCenter.join(p4);
        allyControlCenter.join(p5);

        p1.beAttacked(allyControlCenter);
    }
}
