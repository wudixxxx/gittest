package com.sort;

/**
 * 冒泡排序（升序）
 * 两个对比，大的放后面，进行n-1轮
 *
 * 算法分析：最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
 * 稳定内排序
 * */

public class bubbleSort {

    public static void main(String[] args) {
        int array[] = {12, 44, 4, 36, 18, 21}; //6个元素
        //先进行n-1轮
        for (int i = 0; i < array.length-1; i++) {
            //每一轮的循环对比 第0个开始，总共要进行n-i-1轮
            for (int j = 0; j < array.length-i-1; j++){
                //对比交换
               if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
               }
            }

        }
        for (int i : array) {
            System.out.println(i+"+");
        }
    }
}
