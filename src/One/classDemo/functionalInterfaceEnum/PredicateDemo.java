package One.classDemo.functionalInterfaceEnum;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
    static void main(String[] args) {
        Predicate<Integer> isEven = n->n%2 == 0;
        System.out.println(isEven.test(11));

        BiPredicate<Integer,Integer> issum = (a,b) -> (a+b) %2 == 0;
        System.out.println(issum.test(2,3));
    }
}
