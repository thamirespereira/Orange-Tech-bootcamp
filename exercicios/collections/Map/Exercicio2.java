package exercicios.collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */

public class Exercicio2 {
    public static void main(String[] args) {
        int quantLacamentos = 100;

        List<Integer> valores = new ArrayList<>();
        Random geradorDeLancamento = new Random();
        for (int i = 0; i < quantLacamentos; i++) {
            int numero = geradorDeLancamento.nextInt(6) + 1;
            valores.add(numero);
        }

        Map<Integer, Integer> lancamentos = new HashMap<>();
        for(Integer resultado : valores) {
            if (lancamentos.containsKey(resultado))
                lancamentos.put(resultado, lancamentos.get(resultado) + 1);
            else lancamentos.put(resultado, 1);    
        }

        System.out.print("Jogando");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\nValor " + "Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}
