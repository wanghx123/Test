package day08;

public class PersonTest {
    public static void main(String[] args){
        //创建Person类的对象
        Person p1 = new Person();
        //调用对象的结构  属性 方法
        p1.name = "tom";
        p1.isMale = true;
        p1.eat();
        p1.sleep();


    }

}
class Person{
    //属性
    String name ;
    int age =1 ;
    boolean isMale;


    public void eat(){

    }

    public  void  sleep(){

    }
    //方法

}