package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet <Integer> sequenciaNumerica = new LinkedHashSet<>();

        //adiciona os numeros no set
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(2);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(16);

        System.out.println(sequenciaNumerica);

        //remove o numero do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        //retorna quantidade de itens do set
        System.out.println("Quantidade na sequência numérica: " + sequenciaNumerica.size());

        //navega em todos os itens do iterator

        Iterator <Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer number : sequenciaNumerica){
            System.out.println("---> " + number);
        }

        sequenciaNumerica.clear();

        System.out.println(sequenciaNumerica);

        System.out.println(sequenciaNumerica.isEmpty());
    }
}
