package Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {

    public static void main(String[] args) {

        Set <Double> notasAlunos = new HashSet<>();

        //adiciona as notas no set
        notasAlunos.add(5.8);
        notasAlunos.add(9.3);
        notasAlunos.add(6.5);
        notasAlunos.add(10.0);
        notasAlunos.add(5.4);
        notasAlunos.add(7.3);
        notasAlunos.add(3.8);
        notasAlunos.add(4.0);

        System.out.println(notasAlunos);

        //Remove nota do set
        notasAlunos.remove(3.8);

        System.out.println(notasAlunos);

        //retorna quantidade de itens do set
        System.out.println("Quantidade de notas : " + notasAlunos.size());

        //Navega em todos os itens do iterator
        Iterator <Double> iterator = notasAlunos.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

        for (Double notas : notasAlunos){
            System.out.println("---> " + notas);
        }

        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());
    }
}
