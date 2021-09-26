package com.antguigu.java.day03;


import  java.util.Scanner;

public class ScannerTest {
    public  static  void  main (String[] args){
        Scanner scan = new Scanner( System.in);
        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);

        System.out.println("请输入你的年龄：");
        int num = scan.nextInt();
        System.out.println(num);

        System.out.println("请输入你的体重：");
        Double weight = scan.nextDouble();
        System.out.println(weight);
    }
}
