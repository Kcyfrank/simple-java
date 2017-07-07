package com.demo;

/**
 * 插入排序实现
 *
 * 基本思想：将一个记录插入到已经排好序的有序表中, 从而得到一个新的,记录数增1的有序表
 *
 * 最坏时间复杂度 O(n^2)
 * 最优时间复杂度 O(n)
 * 平均时间复杂度 O(n^2)
 * 空间复杂度	总共 O(n) ，需要辅助空间 O(1)
 *
 * 简单来说，假设当前数组第一位有序，不断从后往前比较大小，有序值大则后移
 * https://zh.wikipedia.org/wiki/%E6%8F%92%E5%85%A5%E6%8E%92%E5%BA%8F
 * @author forip on 2017/7/5.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] testIntegers = {1,12,33,4,2,1,4};
        int[] resultArr = insertionSort(testIntegers);
        for (int arr : resultArr) {
            System.out.print(arr + " ");
        }
    }
    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++ ) {
            int temp = arr[i];
            int j = i - 1;
            //如果将赋值放到下一行的for循环内, 会导致在第10行出现j未声明的错误
            for (; j >= 0 && arr[j] > temp; j-- ) {
                arr[j + 1] = arr[j];
                }
            arr[j + 1] = temp;
            }
        return arr;
    }
}