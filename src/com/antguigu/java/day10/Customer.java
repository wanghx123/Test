package day10;
/*
* javaBean是一种Java语言写成的可重复用组件
*类是公共的
*有一个无参的构造器
*有属性，且有对应的get、set方法
*
* */
public class Customer {

    private int id;
    private String name;
    public Customer(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
