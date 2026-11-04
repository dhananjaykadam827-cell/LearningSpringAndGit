package One.classDemo.functionalInterfaceEnum;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    static void main(String[] args) {
        BiConsumer<Integer, Integer> add  = (a,b) -> System.out.println(a+b);
        add.accept(1,2);
    }
}
