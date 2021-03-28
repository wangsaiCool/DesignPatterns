package patterns.适配器模式.对象适配器模式;

/**
 * 二分查找
 * <p>
 * Created by WangSai on 2021/3/28
 */
public class BinarySearch {

    /**
     * 二分查找
     *
     * @param arr
     * @param target
     * @return 目标值的角标
     */
    public int binarySearch(int[] arr, int target) {
        if (null == arr || arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int pos = (high - low) / 2 + low;
            int posValue = arr[pos];
            if (target < posValue) {
                high = pos - 1;
            } else if (target > posValue) {
                low = pos + 1;
            } else {
                return pos;
            }
        }
        return -1;

    }
}
