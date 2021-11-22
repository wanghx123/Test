package day15.java2;

public class InterClassTest1 {

    //返回一个实现Comparable接口的对象
    public Comparable getComparable(){
        //创建一个实现了Comparable接口的类：局部内部类
//        class MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();

        //方式二
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
