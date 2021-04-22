package patterns.策略模式;

/**
 * Created by WangSai on 2021/4/22
 */
public class VipDiscountStrategy implements DiscountStrategy{
    public double calculate(double price) {
        System.out.println("== VIP 票.");
        System.out.println(">> 增加积分");

        return price * 0.6;
    }
}
