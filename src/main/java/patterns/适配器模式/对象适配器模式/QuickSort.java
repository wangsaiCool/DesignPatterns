package patterns.适配器模式.对象适配器模式;

/**
 * 快排
 * <p>
 * Created by WangSai on 2021/3/28
 */
public class QuickSort {

    public int[] quickSort(int[] arr) {
        if (null == arr || 0 == arr.length) {
            return arr;
        }
        quickSortCore(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSortCore(int[] arr, int low, int high) {
        if (low < high) {
            int pos = partition(arr, low, high);
            quickSortCore(arr, low, pos - 1);
            quickSortCore(arr, pos + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int keeper = arr[low];

        while (low < high) {
            while (low < high && keeper <= arr[high]) {
                high--;
            }
            swap(arr, low, high);
            while (low < high && arr[low] <= keeper) {
                low++;
            }
            swap(arr, low, high);
        }
        return low;
    }

    private void swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

}
