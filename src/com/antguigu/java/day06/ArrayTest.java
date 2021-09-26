package com.antguigu.java.day06;

public class ArrayTest {

    public static void main(String[] args){
        //一维数组的声明和初始化
        //静态初始化
        int[] ids ;
        ids = new int[]{1001,1002,1003, 1004};
        //动态初始化
        String[] name = new String[5];
        name[0] ="王明";
        name[1] ="王鹤";
        //如何获取数组的长度
        System.out.println(name.length);


        //如何遍历数组
        for(int i = 0; i< name.length; i++){
            System.out.println(name[i]);
        }
        //数组元素的初始化值
        int[] arr = new int[4];
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] [] arr2= new int[3][2];

        int [][] arr22 = new int[3][];

        arr22[0] = new int[2];
        int [][] arr23 = new  int[][]{{1},{2},{3}};


        double[][] arr33 = new double[4][];
        System.out.println();
    }

}
