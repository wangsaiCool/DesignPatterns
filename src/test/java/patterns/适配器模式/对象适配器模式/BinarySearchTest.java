package patterns.适配器模式.对象适配器模式;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by WangSai on 2021/3/28
 */
public class BinarySearchTest {

    @Test
    public void binarySearch() {
        int[] arr = {1};
        int index = new BinarySearch().binarySearch(arr, 1);
        Assert.assertEquals(0, index);

    }
}