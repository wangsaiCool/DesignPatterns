package patterns.适配器模式.对象适配器模式;

/**
 * 成绩操作的抽象接口， 目标类
 *
 * Created by WangSai on 2021/3/28
 */
public interface ScoreOperation {

    // 给成绩排序
    public int[] sort(int[] arr);

    // 查找程序
    public int binarySearch(int[] arr, int target);
}
