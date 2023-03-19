package exercicios.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MeusCachorros {

    public static void main(String[] args) {

        Map< String, Integer > cachorros = new HashMap<>() {{
        put("Morgana", 8);
        put("Lana", 7);
        put("Feijão", 4);
        put("Nina", 5);
        put("Amora", 9);
        put("Apolo", 7);
    }};
    System.out.println("Quantidade de cachorros: " + cachorros.size());

    System.out.println("Meus cachorros: " + cachorros);

    Map <String, Integer> cachorros2 = new TreeMap<>(cachorros);
    System.out.println("Ordem alfabética: " + cachorros2);

    Collection <Integer> idade = cachorros.values();
    String maisNovo = "";
    String maisVelho = "";

    for (Map.Entry<String, Integer> entry  : cachorros.entrySet()) {
        if(entry.getValue().equals(Collections.max(idade))) maisVelho = entry.getKey();
        if(entry.getValue().equals(Collections.min(idade))) maisNovo = entry.getKey();
    }
    System.out.printf("Meu cachorro mais velho é a(o) %s com %d anos.\n" , maisVelho, Collections.max(idade));
    System.out.printf("Meu cachorro mais novo é a(o) %s com %d anos.\n" , maisNovo, Collections.min(idade));

    int soma = 0;
    Iterator<Integer> iterator = cachorros.values().iterator();
    while(iterator.hasNext()){
        soma += iterator.next();
    }

    System.out.println("A idade Média dos meus cachorros é de: " + soma / cachorros.size() + " anos");
        }
        }

