package exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores, 
o primeiro representando o nome de aluno e o segundo representando a sua idade.
Pare o programa inserindo o valor 0 no campo nome.
*/
public class NomeEIdade {
    /**
     * @param args
     */
    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);
        int idade;
        String nome = "";
            
        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if (nome.equals("0")) break;

            System.out.println("Idade: " );
            idade = scan.nextInt();

            if (idade == 0) break;
            
        scan.close();
        }

        System.out.println("Fim do programa");
        
    }

    
    
}