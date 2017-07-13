package com.demo;

/**
 * 简单选择排序
 *
 * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
 *
 * 最坏时间复杂度 О(n²)
 * 最优时间复杂度 О(n²)
 * 平均时间复杂度 О(n²)
 * 空间复杂度 О(n) total, O(1) auxiliary
 *
 * https://zh.wikipedia.org/wiki/%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F
 * @author forip on 2017/7/13.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] testArrs = {1,12,33,4,2,1,4};
        int[] resultArr = selectionSort(testArrs);
        for (int arr : resultArr) {
            System.out.print(arr + " ");
        }
    }
    private static int[] selectionSort(int[] arrs) {
        int i, j, min, temp, len = arrs.length;
        for (i = 0; i < len - 1; i++) {
            min = i; //假设当前i为数组最小值的下标
            for (j = i + 1; j < len; j++) { //在未排序元素中继续寻找最小元素，并保存其下标
                if (arrs[min] > arrs[j]) {
                    min = j;
                }
            }
            temp = arrs[min]; //将最小元素放到已排序序列的末尾
            arrs[min] = arrs[i];
            arrs[i] = temp;
        }
        return arrs;
    }
}
