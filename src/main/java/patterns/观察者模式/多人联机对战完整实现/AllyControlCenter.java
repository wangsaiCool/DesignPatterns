package patterns.观察者模式.多人联机对战完整实现;

/**
 * 具体目标类
 * <p>
 * Created by WangSai on 2021/4/6
 */
public class AllyControlCenter extends Subject {

    public AllyControlCenter(String allyName) {
        super(allyName);
    }

    public void notifyObserver(String playName) {
        System.out.println(this.allyName +"战队紧急通知，队员"+playName + "正在遭受攻击，请立即支援！" );
        for (Observer player : observers) {
            if (!player.getName().equalsIgnoreCase(playName)) {
                player.help();
            }
        }
    }
}
