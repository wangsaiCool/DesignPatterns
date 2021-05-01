package patterns.职责链模式;

/**
 * Created by WangSai on 2021/5/1
 */
public class CongressHandler extends Handler {
    public CongressHandler(String name) {
        super(name);
    }

    public void processRequest(Request request) {
        System.out.println("召开董事会：" + this.name
                + ", 审批采购单：" + request.getId()
                + ", 金额：" + request.getAmount()
                + ", 订单描述：" + request.getDescription());
    }
}
