package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExemploTreeSet {

    public static void main(String[] args) {

        TreeSet <String> treeCapitais = new TreeSet<>();

        //Monta a Arvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());

        //retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.last());

        //retorna a primeira capital abaixo na arvore capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        //retorna a primeira capital no topo da arvore, após a remoção do set
        System.out.println(treeCapitais.pollFirst());

        //retorna a ultima capital no final da arvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        //navega por todos os itens

        Iterator <String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String cidade : treeCapitais){
            System.out.println("--->" + cidade);
        }

        System.out.println("Quantidade de cidades : " + treeCapitais.size());

        treeCapitais.clear();

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.isEmpty());
    }
}
