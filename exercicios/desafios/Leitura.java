package exercicios.desafios;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Páginas: ");
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int dias = paginas / paginasLidas;
        
        System.out.println(dias + " dias");
        leitor.close();
        
    }
    
}
