package day15;


/*
* 关于抽象类的匿名子类的使用
*
* */
public class PersonTest {
    public static void main(String[] args) {
        System.out.println("中文乱码？");
//        method(new Student());//匿名对象
//        Worker worker =  new Worker();
//        method1(worker);//非匿名的类非匿名的对象

//        method1(new Worker());//非匿名的类匿名的对象
        //创建了一个匿名子类的对象
//        Person p = new Person(){
//            @Override
//            public void eat() {
//                System.out.println("好好呼吸");
//            }
//
//            @Override
//            public void breath() {
//            }
//        };
//        method1(p);
        //创建匿名子类的匿名对象
//        method1(new Person() {
//            @Override
//            public void eat() {
//
//            }
//
//            @Override
//            public void breath() {
//
//            }
//        });
    }

    public static void method1(Person p){
        p.eat();
        p.walk();
    }
    public static void method(Student s){


    }

}
class Worker extends Person{

        @Override
        public void eat() {
        }

        @Override
        public void breath() {
        }

}