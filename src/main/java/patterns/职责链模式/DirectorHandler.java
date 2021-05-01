package patterns.职责链模式;

/**
 * Created by WangSai on 2021/5/1
 */
public class DirectorHandler extends Handler {
    public DirectorHandler(String name) {
        super(name);
    }

    public void processRequest(Request request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name + "审批采购单：" + request.getId() + ", 金额：" + request.getAmount()
                    + ", 订单描述：" + request.getDescription());
        } else {
            System.out.println("主任" + this.name + "没有权限审批采购单，转交给上级领导。");
            this.successor.processRequest(request);
        }
    }
}
