package patterns.策略模式;

/**
 * Created by WangSai on 2021/4/22
 */
public class StudentDiscountStrategy implements DiscountStrategy{
    public double calculate(double price) {
        System.out.println("== 学生票.");
        return price * 0.85;
    }

}
