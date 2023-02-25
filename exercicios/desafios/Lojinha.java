package exercicios.desafios;

import java.util.Scanner;

public class Lojinha {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Dinheiro: ");
        int dinheiro = leitor.nextInt();
        int doces = 2;
        int quantidadeDeDoces = doces * dinheiro;
        
        System.out.println("O cliente obteve " + quantidadeDeDoces + " doces");
        
        leitor.close();
        // Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada

    }
}
