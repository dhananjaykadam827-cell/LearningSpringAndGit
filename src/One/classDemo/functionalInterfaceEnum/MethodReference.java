package One.classDemo.functionalInterfaceEnum;

import java.util.Arrays;
import java.util.List;

public class MethodReference {
    static void main(String[] args) {
        List<String>  name = Arrays.asList("dk","nk", "rh");

//        name.forEach((String s) -> {
//            System.out.println(s);
//        });

//        name.forEach((s) -> System.out.println(s));

        //method reference code
        name.forEach(System.out::println);
    }
}
