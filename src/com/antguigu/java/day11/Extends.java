package day11;
/*
* 面向对象的特征之二：继承性
* 一、继承性的好处
* ①减少了代码的冗余，提高了代码的复用性
* ②便于功能的扩展
* ③为之后多态性的使用，提供了前提
*
* 二继承的格式：class A extends B{}
*   A：子类、派生类、subclass
*   B：父类、超类、基类、superclass
*
* 体现：一旦子类A继承父类B以后，子类A中就获取了父类B中声明的结构属性、方法。
* 特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构。
* 只有因为封装性的影响，使得子类不能直接调用父类的结构而已。
* 2.2子类继承父类以后，还可以声明自己特有的属性或方法:实现功能的拓展。
* 子类和父类的关系，不同于子集和集合的关系。
* */
public class Extends {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 1;
        p1.eat();

        Student s1 = new Student();
        s1.eat();
        s1.sleep();
    }
}
