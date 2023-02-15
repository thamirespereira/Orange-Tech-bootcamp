package exercicios.desafios;

import java.util.Scanner;

public class Pacotes {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Tamanho: ");
        int tamanho = leitor.nextInt();
        
        switch (tamanho) {
            case 1:
                System.out.println("/");
                break;
            case 2:
                System.out.println("//");
                break;
            case 13:
                System.out.println("///");
                break;
            case 4:
                System.out.println("////");
                break;
            case 5:
                System.out.println("/////");
                break;
            case 6:
                System.out.println("//////");
                break;
            case 7:
                System.out.println("///////");
                break;
            case 8:
                System.out.println("////////");
                break;
            case 9:
                System.out.println("/////////");
                break;
            case 10:
                System.out.println("//////////");
                break;
            default:
                break;
        }
        
       
        leitor.close();
     }
}
