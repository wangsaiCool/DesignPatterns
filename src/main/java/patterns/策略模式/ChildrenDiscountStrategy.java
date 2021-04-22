package patterns.策略模式;

/**
 * Created by WangSai on 2021/4/22
 */
public class ChildrenDiscountStrategy implements DiscountStrategy {
    public double calculate(double price) {
        System.out.println("== 儿童票.");
        if (price > 10) {
            return price - 10;
        } else {
            return price;
        }
    }
}
