package com.antguigu.java.day05;

public class ForWhileTest {

    public static  void main (String[] args){
        //遍历100以内的所有偶数
        int i = 1;
//        while (i <= 100){
//            if (i %2 ==0 ){
//                System.out.println(i);
//            }
//            i++;
//        }
//
//        System.out.println(i);
        int num =1;
        do {
            if (num % 2 == 0){
                System.out.println(num);
            }
            num++;
        }while (
                num <= 100
        );
    }


}
