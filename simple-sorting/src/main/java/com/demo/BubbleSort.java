package com.demo;

/**
 * 冒泡排序实现
 *
 * 基本思想是:两两比较相邻记录的关键字,如果反序则交换
 * 冒泡排序时间复杂度最好的情况为O(n),最坏的情况是O(n^2)
 *
 * 简单来说，每次循环把最大的数放到最后，把比较小的数不断往前移
 * @author forip
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] testIntegers = {1,12,33,4,2,1,4};
        int[] resultArr = bubblesort(testIntegers);
        for (int arr : resultArr) {
            System.out.print(arr + " ");
        }
    }

    private static int[] bubblesort(int[] arrayNeedSort) {
        int i, j, len = arrayNeedSort.length;
        for (i = 0; i < len - 1; i++) {
            for (j = 0; j < len - 1 - i; j++) {
                if (arrayNeedSort[j] > arrayNeedSort[j + 1]) {
                    swap(arrayNeedSort, j);
                }
            }
        }
        return arrayNeedSort;
    }

    private static void swap(int[] arrayNeedSort, int j) {
        int temp;
        temp = arrayNeedSort[j];
        arrayNeedSort[j] = arrayNeedSort[j + 1];
        arrayNeedSort[j + 1] = temp;
    }
}
