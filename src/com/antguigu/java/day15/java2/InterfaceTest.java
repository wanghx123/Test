package day15.java2;
/*
* 接口的使用
* 1.接口使用interface来定义
* 2。java中接口和类是并列的结构
* 3，如何定义接口，定义接口中的成员
*   3.1 JDK7及以前:只能定义全局常量和抽象方法
* 》全局常量：public、static、final的
* 》抽象方法：public、abstract的
*
*   3.2 JDK8 除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法
* 4.接口中是不能定义构造器的!意味着接口不能够实例化
*
* 5.Java开发中，接口通过让类去实现（implements）的方式来使用
*   如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
*   如果实现类没有覆盖接口中所有的抽象方法，则此实现类仍为一个抽象类
*
* 6.Java可以实现多个接口---》弥补了Java单继承性的局限性
* 格式：class AA extends BB implements CC,DD,EE
*
* 7.接口与接口之间可以继承，而且可以多继承
* */
public class InterfaceTest {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.fly();
        System.out.println("面向对象");
    }
}

interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;//第一宇宙速度

    int MIN_SPEED = 1;

    //抽象方法
    public abstract void fly();
    //省略了public abstract
    void stop();


}
class Plane implements Flyable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}

abstract class Kite implements Flyable{

    @Override
    public void fly() {

    }
}