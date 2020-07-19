package com.sort;



/**
 * 表现最稳定的排序算法之一，因为无论什么数据进去都是O(n2)的时间复杂度，所以用到它的时候，数据规模越小越好。
 * 唯一的好处可能就是不占用额外的内存空间了吧。
 * 理论上讲，选择排序可能也是平时排序一般人想到的最多的排序方法了吧。
 *
 * 选择排序（升序）
 *
 * 原理：找最小放最前，依次循环
 *
 * 最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
 * 不稳定、内排序
 *
 * */
public class SelectionSort {


    public static void main(String[] args) {
        int array[] = {12, 44, 4, 36, 18, 21}; //6个元素

        for (int i = 0; i < array.length-1; i++) {  //n-1轮
            int minIndex = i;

            //每轮的元素和array[minIndex]比较大小（比较n次）
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到最小的数
                    minIndex = j; //将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        //打印
        for (int i : array) {
            System.out.println(i);
        }
    }
}
