package exercicios.desafios;

import java.util.Scanner;

public class Multas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Velocidade: ");
        int velocidadeAtual = leitor.nextInt();
        
        if (velocidadeAtual > 60)
          System.out.println("Foi multado");
        
        else 
          System.out.println("Nao foi multado");
        
        //Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.
        leitor.close();
    }
}
