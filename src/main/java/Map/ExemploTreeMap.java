package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

    public static void main(String[] args) {

        TreeMap<String, String> treeCapitais = new TreeMap<>();
        treeCapitais.put("RS","Porto Alegre");
        treeCapitais.put("SC","Florianópolis");
        treeCapitais.put("PR","Curitiba");
        treeCapitais.put("SP","São Paulo");
        treeCapitais.put("RJ","Rio de Janeiro");
        treeCapitais.put("MG","Belo Horizonte");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstKey());

        //retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.lastKey());

        //retorna a primeira capital abaixo na arvore capital parametrizada
        System.out.println(treeCapitais.lowerKey("SC"));

        //retorna a primeira capital acima na arvore capital parametrizada
        System.out.println(treeCapitais.higherKey("SC"));

        //retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.firstEntry().getKey()+ " - " + treeCapitais.firstEntry().getValue());

        ////retorna a ultima capital no topo da arvore
        System.out.println(treeCapitais.lastEntry().getKey()+ " - " + treeCapitais.lastEntry().getValue());

        //retorna a primeira capital baixo da arvore da capital parametrizada
        System.out.println(treeCapitais.lowerEntry("SC").getKey()
                +" - " + treeCapitais.lowerEntry("SC").getValue());

        //retorna a primeira capital acima da arvore da capital parametrizada
        System.out.println(treeCapitais.higherEntry("RS" ).getKey()
                + " - " + treeCapitais.higherEntry("RS").getValue());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        Map.Entry<String,String> firstEntry = treeCapitais.pollFirstEntry();
        Map.Entry<String,String> lastEntry = treeCapitais.pollLastEntry();

        System.out.println(firstEntry.getKey() + " - " + firstEntry.getValue());
        System.out.println(lastEntry.getKey() + " - " + lastEntry.getValue());

        System.out.println(treeCapitais);


        Iterator<String> iterator = treeCapitais.keySet().iterator();
        while (iterator.hasNext()){
           String key = iterator.next();
            System.out.println(key + " -----> " + treeCapitais.get(key));
        }

        for (String capital: treeCapitais.keySet()){
            System.out.println(capital + " ---> " + treeCapitais.get(capital));
        }

        for (Map.Entry<String,String> capital : treeCapitais.entrySet()){
            System.out.println(capital.getKey() + " -> " + capital.getValue());
        }








        System.out.println("Quantidade de cidades : " + treeCapitais.size());

        treeCapitais.clear();

        System.out.println(treeCapitais);

        System.out.println(treeCapitais.isEmpty());
    }
}
