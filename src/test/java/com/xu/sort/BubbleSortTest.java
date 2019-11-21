package com.xu.sort;

import com.xu.util.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sort() {
        int[] arr = {3,4,6,1,2,9,8};
        BubbleSort.sort(arr);
        ArrayUtils.printArr(arr);
    }
}