package com.antguigu.java.day07;
/*
 * �㷨�Ŀ��飺����ֵ��������Ԫ�ص����ֵ����Сֵ��ƽ�������ܺ͵�
 *
 * ����һ��int�͵�һά���飬����10��Ԫ�أ��ֱ�һЩ���������
 * Ȼ���������Ԫ�ص����ֵ����Сֵ����ֵ��ƽ��ֵ�������������
 * Ҫ�����������������λ����
 *
 * [10,99]
 * ��ʽ��(int)(Math.random() * (99 - 10 + 1) + 10)
 *
 */
public class ArrayTest1 {
    public  static  void  main(String[] args){
        int[] arr =new int[10];
        for (int i = 0; i<arr.length; i++){
            arr[i]=(int)(Math.random()*(99-10+1)+10);
        }

        //������Ԫ�ص����ֵ
        int maxValue = arr[0];
        for(int i =1; i< arr.length;i++){
            if(maxValue<arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println("���ֵΪ��" + maxValue);


        //������Ԫ�ص���Сֵ
        int minValue = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(minValue > arr[i]){
                minValue = arr[i];
            }
        }
        System.out.println("��СֵΪ��" + minValue);

        //������Ԫ�ص��ܺ�
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("�ܺ�Ϊ��" + sum);

        //������Ԫ�ص�ƽ����
        int avgValue = sum / arr.length;
        System.out.println("ƽ����Ϊ��" + avgValue);
    }
}
