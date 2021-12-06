package List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {

    public static void main(String[] args) {

        List <String> esportes = new Vector<>();

        //Adiciona 4 esportes no vetor
        esportes.add("Surf");
        esportes.add("Natação");
        esportes.add("Basquete");
        esportes.add("Muay Thai");

        System.out.println(esportes);
        //Altera o Valor da posição 3 do vetor
        esportes.set(3, "Kung Fu");

        //Remove o esporte da posição 2
        esportes.remove(2);

        //Remove o esporte Kung Fu do vetor
        esportes.remove("Kung Fu");
        System.out.println(esportes);

        //retorna o primeiro item do vetor
        System.out.println(esportes.get(0));

        //Navega nos esportes
        for (String esporte : esportes){
            System.out.println(esporte);
        }

    }
}
