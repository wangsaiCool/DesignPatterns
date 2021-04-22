package patterns.策略模式;

/**
 * Created by WangSai on 2021/4/22
 */
public class MainTest {
    public static void main(String[] args) {
        MovieTicketContext context = new MovieTicketContext();
        double origPrice = 60.0;
        context.setPrice(origPrice);

        DiscountStrategy strategy = new StudentDiscountStrategy();
        context.setStrategy(strategy);
        double discountPrice = context.calculate();
        System.out.println(discountPrice);

        strategy = new ChildrenDiscountStrategy();
        context.setStrategy(strategy);
        discountPrice = context.calculate();
        System.out.println(discountPrice);

        strategy = new VipDiscountStrategy();
        context.setStrategy(strategy);
        discountPrice = context.calculate();
        System.out.println(discountPrice);

    }
}
