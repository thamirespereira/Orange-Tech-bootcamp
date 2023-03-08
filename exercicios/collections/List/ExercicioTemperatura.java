package exercicios.collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExercicioTemperatura {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         List <Double> temperaturas = new ArrayList<>();

         int mes = 0;
         double soma = 0;

         while (true) {
            if(mes == 6) break;
            System.out.println("Temperatura: ");
            double temperatura = leitor.nextDouble();
            temperaturas.add(temperatura);
            mes++;
            soma += temperatura;
         } 
         //todas as temperaturas
         System.out.println("Temperaturas: " + temperaturas);
         System.out.println();

         //temperatura media
         double tempMedia = soma / mes;
         System.out.println("Temperatura média: " + tempMedia);

         //temperatura acima da média
         System.out.print("Temperaturas acima da média: ");
         temperaturas.stream()
                 .filter(t -> t > tempMedia)
                 .forEach(t -> System.out.printf("%.1f ", t));
        System.out.println();

        //mostrar temperatura e mes
        Iterator<Double> iterator = temperaturas.iterator();

        int count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > tempMedia) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;

         leitor.close();

    }
    
}
}
