package patterns.策略模式;

/**
 * 环境类
 * <p>
 * Created by WangSai on 2021/4/22
 */
public class MovieTicketContext {
    private DiscountStrategy strategy;
    private double price;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculate() {
        return strategy.calculate(price);
    }
}
