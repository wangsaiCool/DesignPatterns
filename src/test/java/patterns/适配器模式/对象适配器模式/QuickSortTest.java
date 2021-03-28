package patterns.适配器模式.对象适配器模式;

import org.junit.Test;

/**
 * Created by WangSai on 2021/3/28
 */
public class QuickSortTest {

    @Test
    public void quickSort() {
        int[] arr1 = {3, 1, 5, 0, 3, 3, 3, 2, 6, 9, 7};
        new QuickSort().quickSort(arr1);
        printArr(arr1);

        int[] arr2 = {1, 1, 5, 0, 3, 3, 3, 2, 6, 9, 1};
        new QuickSort().quickSort(arr2);
        printArr(arr2);

        int[] arr3 = {3, 1, 5, 0, 3, 3, 3, 2, 6, 9, 1};
        new QuickSort().quickSort(arr3);
        printArr(arr3);
    }

    private void printArr(int[] arr) {
        if (null != arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}