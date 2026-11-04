package One.classDemo.functionalInterfaceEnum;

import java.util.function.Function;

@FunctionalInterface
    interface BookAction{
        void perform();
    }
    @FunctionalInterface
    interface Operation{
        int add(int a, int b);
    }

//    //function
//    public static Function<Integer,Integer> subFun = (a) -> a-2;


public class FunInterfaceEnum {
    static void main(String[] args) {
       BookAction step1 = () -> System.out.println("Action perfromed");

       step1.perform();

       //fun interface with parameter
        Operation one = (int a, int b) ->{
            return  a+b;
        };
        System.out.println(one.add(2,3));

        //thred interface
        new Thread( () -> System.out.println("thread created"));

//        System.out.println(subFun.apply(9));

    }
}
