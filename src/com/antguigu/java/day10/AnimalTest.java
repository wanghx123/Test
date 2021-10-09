package day10;

/*面向对象的特征之一，封装与隐藏
* 一.问题的引入
* 当我们创建一个类以后，我们可以通过对象属性的方式，对对象的属性进行赋值。这里赋值操作要受到属性的数据类型和存储范围制约
*
*封装性的体现
*我们将类的属性xxx私有化(private),同时，提供公共的(public)方法来获取(getXxx)和设置(setXxx)此属性的值
*拓展：封装性的体现：① 如上  ② 不对外暴露的私有的方法  ③ 单例模式   ...
*
*封装性的体现，需要权限修饰符来配合
*1.java规定的4种权限（从小到大排列）:private、缺省、protected、public
*2.4种权限用来修饰类及类的内部结构：属性、方法、构造器、内部类
*   修饰类的话只能使用：缺省、public
* 总结封装性：Java提供了4种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小。
*
* */
public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.show();

    }
}
class Animal{
    String name;
    int age;
    int legs;
    //对属性的设置
    public void setLegs(){

    }

    public void eat(){
        System.out.println("动物进食");
    }
    public void show(){
        System.out.println("name= "+ name +",age = "+ age + ",lags = " + legs);
    }

    //提供关于属性age的get和set方法
    public int getAge(){
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}
