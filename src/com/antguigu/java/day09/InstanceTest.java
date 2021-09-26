package day09;
/*
* 理解万事万物皆对象
* 1.在java语言范畴之中，我们都将功能结构等封装到类中，通过类的实例化，来调用具体的功能结构
*>Scanner,String等
*>文件，File
*>网络资源，URL
* 2.涉及到java语言与前端的Html，后端的数据库交互时，前后端的结构在java层面交互时，都体现为类，对象。
*二、内存解析的说明
* 1.引用类型的变量，只可能存储两类值，null或者地址值（含变量的类型）
* 三、匿名对象的使用
* 1.理解，我们创建的对象没有显示的赋给一个变量名。即为匿名对象
* 2.特征：匿名对象只能调用一次，
* 3.使用：
* */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);
        p.playGame();
        p.sendEmail();
        //匿名对象
        new Phone().sendEmail();
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());

    }
}
class PhoneMall{
    public void show (Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
class Phone{
    double price; //价格

    public void sendEmail(){
        System.out.println("发送邮件！");
    }

    public void playGame(){
        System.out.println("打游戏！");
    }
}
