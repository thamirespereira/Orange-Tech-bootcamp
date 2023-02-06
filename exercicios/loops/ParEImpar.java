package exercicios.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            int quantNumeros;
            int numero;
            int quantPares = 0, quantImpares = 0;
            
            System.out.println("Quantidade de números: ");
            quantNumeros = scan.nextInt();

            int contador = 0;
            do {
                System.out.println("Números: ");
                numero = scan.nextInt();

                if (numero % 2 == 0) 
                    quantPares++;
                    else 
                    quantImpares++;
                
                contador++;
            } while (contador < quantNumeros);
            
            System.out.println("Quantidade de números pares: " + quantPares) ;
            System.out.println("Quantidade de números impares: " + quantImpares) ;
    }
}
}
