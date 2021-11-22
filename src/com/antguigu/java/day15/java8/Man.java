package day15.java8;

interface Filial {
    default void help() {
        System.out.println("1111");
    }
}

interface Spoony {
    default void help() {
        System.out.println("222");
    }
}
class Father{
    public void help(){
        System.out.println("333");
    }
}


class Man extends Father implements Filial,Spoony{
    @Override
    public void help() {
        Filial.super.help();
        Spoony.super.help();
    }
}

