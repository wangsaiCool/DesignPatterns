package patterns.状态模式.放大镜状态转换;

/**
 * 充当环境类
 * <p>
 * Created by WangSai on 2021/5/5
 */
public class Screen {
    private State currentState;
    private State normalState;
    private State largerState;
    private State largestState;

    public Screen() {
        this.normalState = new NormalState();
        this.largerState = new LargerState();
        this.largestState = new LargestState();
        this.currentState = this.normalState;
    }

    public State getState() {
        return currentState;
    }

    public void setState(State currentState) {
        this.currentState = currentState;
    }

    public void onClick() {
        if (currentState == normalState) {
            this.setState(largerState);
            this.currentState.display();
        } else if (currentState == largerState) {
            this.setState(largestState);
            this.currentState.display();
        } else if (currentState == largestState) {
            this.setState(normalState);
            this.currentState.display();
        }
    }



}
