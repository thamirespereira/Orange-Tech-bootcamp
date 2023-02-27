package exemplo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lists { 

    public static void main(String[] args) {

//    List notas = new ArrayList(); //antes do java 5
    
//    ArrayList<Double> notas = new ArrayList<>(); 

//    List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); 

    //não adiciona e nem remove elemetos
    /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    notas.add(10d);
    System.out.println(notas);*/

    /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    notas.add(1d);
    notas.remove(5d);
    System.out.println(notas);*/

    System.out.println("Crie uma lista e adicione as sete notas: ");

        List <Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());
        System.out.println("");

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println("");

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas);
        System.out.println("");

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);
        System.out.println("");

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println("");

        /*System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);
        System.out.println("");*/

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());
        System.out.println("");

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("");

        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println("");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double proximo = iterator.next();
            soma += proximo;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("");
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println("");

        System.out.println("Remova a nota  0");
        notas.remove(0d);
        System.out.println(notas);
        System.out.println("");

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);
        System.out.println("");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double proximo = iterator1.next();
            if (proximo < 7) iterator1.remove();
            }
        System.out.println(notas);
        System.out.println("");

        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
        System.out.println("");*/

        //exercício LinkedList
        System.out.println("Crie uma lista chamada notas2"  + " e coloque todos os elementos da list Arraylist nessa nova lista: ");
        List <Double> notas2 = new LinkedList<Double>();
        notas2.addAll(notas);
        System.out.println(notas2);
        System.out.println("");

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));
        System.out.println("");

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);
        }
    }



