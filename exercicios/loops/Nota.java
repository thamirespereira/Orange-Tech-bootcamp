package exercicios.loops;

import java.util.Scanner;

/*Faça um programa que peça uma nota entre 0 e 10,  
 * mostre uma mensagem caso o valor seja inválido e
 * continue pedindo até que o usuário informe um valor válido.
 */

 public class Nota{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int nota;

            System.out.println("Digite uma nota: ");
            nota = scan.nextInt();

            while (nota < 0 || nota > 10) {
                System.out.println("Valor inválido. Digite novamente: ");
                nota = scan.nextInt();
            }
        }
    }
 }