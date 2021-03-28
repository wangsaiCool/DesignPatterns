package patterns.适配器模式.对象适配器模式;

/**
 * Created by WangSai on 2021/3/28
 */
public class MainTest {

    public static void main(String[] args) {
        // 针对抽象接口ScoreOperation编程
        ScoreOperation operation = new ScoreOperationAdapter();

        int[] scores = {85, 98, 100, 82, 89, 99, 59, 60};
        int[] result = operation.sort(scores);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();


        int index = operation.binarySearch(result, 100);
        System.out.println(index);

    }
}
