package exercicios.collections.List;

import java.util.ArrayList;
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



         leitor.close();

    }
    
}
