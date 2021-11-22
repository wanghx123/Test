package day15.exer1;

public class ComparableCircle extends Circle implements CompareObject{

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
            //错误的
//            return  (int) (this.getRedius() -c.getRedius());
            //正确的方式一
//            if(this.getRedius() >c.getRedius()){
//                return 1;
//            }else if (this.getRedius() <c.getRedius()){
//                return -1;
//            }else {
//                return 0;
//            }
            //正确的方式二
            return this.getRedius().compareTo(c.getRedius());
        }else{
//            return 0;
            throw new RuntimeException("传入的数据类型不匹配");
        }
    }

    public ComparableCircle(Double redius) {
        super(redius);
    }
}
