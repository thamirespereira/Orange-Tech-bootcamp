package exercicios.arrays;

import java.util.Scanner;

/*Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes. */

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        
        int contador = 0;
        int quantConsoantes = 0;

        do {
            System.out.print("Letra: ");
            String letra = scan.nextLine();
            // se a letra não for igual a: a, e, i, o, u
            if (!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))) {
                    //atribua a letra ao elemento do vetor na posição indicada pelo contador, caso seja consoante.
                    consoantes[contador] = letra;
                    quantConsoantes++;
                }
        contador++;
        } while (contador < consoantes.length); //enquanto o contador for menor que o array
            System.out.print("consoantes: ");

            for (String consoante : consoantes){ //para cada consoante dentro do array consoanntes

                if (consoante != null) // se o valor da consoante for diferente de null
                System.out.print(consoante + " ");
            }

            System.out.println("\nQuantidade de consoantes: " + quantConsoantes);

        scan.close();
    }
}
