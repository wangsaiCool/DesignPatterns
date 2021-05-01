package patterns.职责链模式;

/**
 * Created by WangSai on 2021/5/1
 */
public abstract class Handler {
    protected Handler successor;
    protected String name;

    public Handler(String name) {
        this.name = name;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void processRequest(Request request);
}
