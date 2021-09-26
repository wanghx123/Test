package com.antguigu.java.day06;

/*
* 2.二维数组的使用：
* ①二维数组的声明和初始化
* ②如何调用数组指定位置的元素
* ③如何获取数组的长度
* ④如何遍历数组
* ⑤数组元素的默认初始化值 :见 ArrayTest3.java
* ⑥ 数组的内存解析 :见 ArrayTest3.java
*
* */

public class ArrayTest2 {

    public static void main(String[] args) {
        //二维数组的声明和初始化
        int[] arr = new int[]{1, 2, 3};//一维数组
        //静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};

        int[][] ar2 = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        for(int i=0;i<ar2.length;i++){
            for(int y=0;y<ar2[i].length;y++){
                sum += ar2[i][y];
            }
        }
        System.out.println(sum);
    }

}
