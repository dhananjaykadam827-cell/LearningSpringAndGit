package One.classDemo.functionalInterfaceEnum;
import java.util.function.BiFunction;
public class BiFunctionDemo {
    public  static BiFunction<Integer,Integer,Integer> addFun =
            (a,b) -> a+b+3;
    public static BiFunction<Integer,Integer,Integer> subFun = (a,b) -> a-b;

    static void main(String[] args) {
        System.out.println(addFun.apply(1,2));
        System.out.println(subFun.apply(5,4));
    }
}
