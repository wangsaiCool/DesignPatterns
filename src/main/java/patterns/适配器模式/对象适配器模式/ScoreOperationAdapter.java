package patterns.适配器模式.对象适配器模式;

/**
 * 适配器分为对象适配器和类适配器，两者最大的区别是：
 * 对象适配器，继承Target类，引用Adaptee类
 * 类适配器，实现Target类，继承Adaptee类
 *
 * Created by WangSai on 2021/3/28
 */
public class ScoreOperationAdapter implements ScoreOperation {
    QuickSort sort;
    BinarySearch binarySearch;

    public ScoreOperationAdapter() {
        sort = new QuickSort();
        binarySearch = new BinarySearch();
    }


    public int[] sort(int[] arr) {
        return sort.quickSort(arr);
    }

    public int binarySearch(int[] arr, int target) {
        return binarySearch.binarySearch(arr, target);
    }
}
