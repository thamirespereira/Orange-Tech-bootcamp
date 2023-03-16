package exercicios.collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Exercicio1 {
    /*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public static void main(String[] args) {
    System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
    Map<String, Integer> populacaoEstados = new HashMap<> (){{
        put ("PE", 9616621);
        put ("AL", 3351543);
        put ("CE", 9187103);
        put ("RN", 3534265);
    }};
    System.out.println(populacaoEstados.toString());
    System.out.println();

    System.out.println("Substitua a população do estado RN por : 3.534.165");
    populacaoEstados.put("RN", 3534165);
    System.out.println(populacaoEstados);
    System.out.println();

    System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
    "PB - 4.039.277: ");
    if (populacaoEstados.containsKey("PB"))
        System.out.println("O estado da Paraíba (PB) está no dicionário.");
    else populacaoEstados.put("PB", 4039277);

    System.out.println(populacaoEstados);
    System.out.println();

    System.out.println("Exiba a população do estado PE: " + populacaoEstados.get("PE"));
}
}

