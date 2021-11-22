package day15;
/*
*abstract关键字的使用
*1.abstract:抽象的
*2.abstract可以用来修饰的结构：类、方法
*
* 3.abstract 修饰类：抽象类
*>此类不能实例化
*>抽象类中有一定的构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
*
* 4.abstract 修饰方法，抽象方法
*>抽象方法只有方法的声明，没有方法体
*>包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
* */
public class AbstractTest {
    public static void main(String[] args) {
//        一旦抽象了就不可实例化了
//        Person p1 = new Person();
//        p1.eat();
    }
}
abstract class Creature{
    public abstract void breath();
}
 abstract class Person extends Creature{
    String name;
    int age;
    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    public abstract void eat();
    public void walk(){
        System.out.println("人走路");
    }
}
class Student extends Person{
    public Student(){

    }
    public Student(String name, int age){
    super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("学生多吃有营养的食物");
    }
    @Override
    public void breath(){
        System.out.println("呼吸新鲜的空气");
    }
}