package com.xu.sort;

/**
 * 冒泡排序
 * 比较相邻的元素。如果第一个比第二个大，就交换它们两个；
 * 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对，这样在最后的元素应该会是最大的数；
 * 针对所有的元素重复以上的步骤，除了最后一个；
 * 重复步骤1~3，直到排序完成。
 */
public class BubbleSort {
    public static int[] sort(int[] arr) {
        if(arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -1 - i; j++) {
                if(arr[j+1] < arr[j]) {
                    int temp = arr[j+1];
                    arr[j+1]  = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
