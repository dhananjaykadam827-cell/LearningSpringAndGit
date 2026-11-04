package One.classDemo.functionalInterfaceEnum.StreamLearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOperation {
    static void main(String[] args) {
        //reduce
        List<Integer> nos = Arrays.asList(1,2,3,4,5);
//        Stream<Integer> st1 = nos.stream();
        int sum = nos.stream().reduce(0,(acc,num) ->acc+num);
        System.out.println(sum);

        //collect()

    }
}
