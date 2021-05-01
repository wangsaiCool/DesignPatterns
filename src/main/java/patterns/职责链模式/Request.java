package patterns.职责链模式;

/**
 * Created by WangSai on 2021/5/1
 */
public class Request {
    private double amount;
    private int id;
    private String description;

    public Request(double amount, int id, String description) {
        this.amount = amount;
        this.id = id;
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
