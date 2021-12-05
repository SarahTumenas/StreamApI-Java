package StreamAPI;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {

        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos elementos dessa lista de String: ");
        numerosAleatorios.forEach(System.out::println);
       //numerosAleatorios.stream().forEach(s -> System.out.println(s));

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
        //Set<String> collectSet = numerosAleatorios.stream().limit(5).collect(Collectors.toSet());
        //System.out.println(collectSet);

        System.out.println("Transforme esta lista de String em uma lista de números inteiros: " );
        /*
        Opção1:
        List<Integer> numerosAleatorios1 = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numerosAleatorios1);

        Opção2:
        numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()).forEach(System.out::println);
        */
        //Opção 3:
        List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
        /*
        Opção1:
        List<Integer> collectlist = numerosAleatorios.stream()
                        .map(Integer::parseInt)
                        .filter(new Predicate<Integer>() {
                            @Override
                            public boolean test(Integer i) {
                                if (i % 2 == 0 && i > 2) return true;
                                return false;
                            }
                        }).collect(Collectors.toList());
        System.out.printl(collectlist);

         */

        //Opção 2:
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("Mostre a media dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt).collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
        System.out.println(numerosAleatoriosInteger);

    }
}
