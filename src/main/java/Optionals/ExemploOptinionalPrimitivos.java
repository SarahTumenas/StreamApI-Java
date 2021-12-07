package Optionals;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptinionalPrimitivos {

    public static void main(String[] args) {

        System.out.println("--\tValor inteiro opcional\t--");
        OptionalInt.of(12).ifPresent(System.out::println);


        System.out.println("--\tValor decimal opcional\t--");
        OptionalDouble.of(55.0).ifPresent(System.out::println);


        System.out.println("--\tValor longo opcional\t--");
        OptionalLong.of(23L).ifPresent(System.out::println);
    }
}
