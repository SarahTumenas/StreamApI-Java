package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List <String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        nomes.set(2, "Larissa");

        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.set(2, "Thaís");
        System.out.println(nomes);


        nomes.remove(4);
        System.out.println(nomes);


        nomes.remove("Thaís");
        System.out.println(nomes);

        String nome =nomes.get(1);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println(tamanho);

        nomes.remove("Larissa");

        tamanho = nomes.size();

        System.out.println(tamanho);

        int posicao = nomes.indexOf("Pedro");
        System.out.println(posicao);


        boolean temJose = nomes.contains("Jose");
        System.out.println(temJose);

        boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        for (String nomeDoItem: nomes){
            System.out.println("-->" + nomeDoItem);
        }

        Iterator <String> iterator = nomes.iterator();
        while (iterator.hasNext()){

            System.out.println("---->" + iterator.next());
        }



        nomes.clear();

        boolean listaVazia1 = nomes.isEmpty();
        System.out.println(listaVazia1);



    }
}
