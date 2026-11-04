package One.classDemo.functionalInterfaceEnum;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    static void main(String[] args) {
        Consumer<String> consumer1 = (str) -> System.out.println(str);

        consumer1.accept("hello");
        consumer1.accept("by");
        List<Integer> no = Arrays.asList(2,3,4,5,6);
        Consumer<Integer> consumer2 = n -> System.out.println(n*2);
        no.forEach(consumer2);
    }
}
