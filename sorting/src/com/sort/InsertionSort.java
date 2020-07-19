package com.sort;


import sun.security.util.Length;

/**
 * 工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），因而在从后向前扫描过程中，
 * 需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 *
 *内排序、稳定
 *
 * 最佳情况：T(n) = O(n)   最坏情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
 *
 * （升序） 原理：从第一个元素开始取出来，从后到前依次比较（找到大于自己的地方进行插入）
 * （从后到前：因为每次插入后面的元素都要后移一位，这样可以尽量减少移动的元素个数）
 *
 * */

public class InsertionSort {

    public static void main(String[] args) {

        int array[] = {12, 44, 4, 36, 18, 21}; //6个元素

        //进行n-1轮（n-1个元素进行比较）
        for (int i = 0; i < array.length-1 ; i++) {
            //拿出一个元素记录起来
            int ind = array[i];
            //每轮比较
            for (int j = array.length-1; j < i; j--) {
                //如果小于则插入
                if(ind < array[j]){
                    //先将插入位置后面的往后移
                    for (int k = array.length; k < j; k++) {
                        array[k+1] = array[k];
                    }
                    //再将数据插入相应位置
                    array[j] = ind;
                }

            }

        }

        //打印
        for (int i : array) {
            System.out.println(i);
        }
    }
}
