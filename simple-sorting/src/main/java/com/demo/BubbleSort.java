package com.demo;

/**
 * 冒泡排序实现
 *
 * 基本思想是:两两比较相邻记录的关键字,如果反序则交换
 *
 * 最坏时间复杂度 O(n^2)
 * 最优时间复杂度 O(n)
 * 平均时间复杂度 O(n^2)
 * 空间复杂度	总共 O(n)，需要辅助空间 O(1)
 *
 * 简单来说，每次循环把最大的数放到最后，把比较小的数不断往前移
 * https://zh.wikipedia.org/wiki/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F
 * @author forip
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] testArrs = {1,12,33,4,2,1,4};
        int[] resultArr = bubblesort(testArrs);
        for (int arr : resultArr) {
            System.out.print(arr + " ");
        }
    }

    private static int[] bubblesort(int[] arrs) {
        int i, j, len = arrs.length;
        for (i = 0; i < len - 1; i++) {
            for (j = 0; j < len - 1 - i; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    swap(arrs, j);
                }
            }
        }
        return arrs;
    }

    private static void swap(int[] arrs, int j) {
        int temp;
        temp = arrs[j];
        arrs[j] = arrs[j + 1];
        arrs[j + 1] = temp;
    }
}
