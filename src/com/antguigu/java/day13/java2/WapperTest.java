package day13.java2;

import org.junit.Test;

/*
* 包装类的使用
* 1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
* 2.掌握的基本数据类型、包装类、String三者之间的相互转换
*
*
* */
public class WapperTest {

    //String类型 ---> 基本数据类型、包装类:调用包装类的parseXxx()
    @Test
    public void test5(){
        String str1 = "123";
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

    }
    //基本数据类型、包装类-->String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void  test4(){
        int num1 =10 ;
        //方式1：连接运算
        String str1 =num1 +"";
        //方式2：调用String的valueOf(Xxx xxx)
        float f1 =12.3f;
        String str2 = String.valueOf(f1);

        Double d1 =  new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);
    }
    /*
    JDk 5.0新特性，自动装箱与拆箱
    * */
    @Test
    public void  test3(){
        //自动装箱  基本数据类型--->包装类
        int num2 = 10;
        Integer in1 = num2;//自动装箱
        boolean b1 = true;
        Boolean b2 = b1;//自动装箱

        //自动拆箱  包装类--->基本数据类型
        int num3 = in1;

    }
    //包装类--->基准数据类型：调用包装类Xxx的xxxvalue()
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }
    //基本数据类型 --->包装类：调用包装类的构造器
    @Test
    public void test1(){
        int num1 = 10 ;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());

    }
}
