package One.classDemo.functionalInterfaceEnum;

import java.util.function.Function;

public class functionInterface {
    public  static Function<Integer,Integer> addFun = (a) -> a+4;
    public  static Function<Integer,Integer> sunFun = (a) -> a-4;

    public  static  Function<Integer,Integer> combileFun =
            addFun.andThen(sunFun);
    static void main(String[] args) {
        System.out.println(addFun.apply(10));
        System.out.println(combileFun.apply(10));
    }
}
