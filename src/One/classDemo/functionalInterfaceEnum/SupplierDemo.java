package One.classDemo.functionalInterfaceEnum;

import java.util.function.Supplier;

public class SupplierDemo {
    static void main(String[] args) {
        Supplier<Double> ramdomNo  = Math::random;
        System.out.println(ramdomNo.get());
        System.out.println(ramdomNo.get());
        System.out.println(ramdomNo.get());
        System.out.println(ramdomNo.get());
        System.out.println(ramdomNo.get());
        System.out.println(ramdomNo.get());
    }
}
