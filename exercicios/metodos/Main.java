package exercicios.metodos;

public class Main {
    
    public static void main(String[] args) {
        
        //calculadora
        System.out.println("Calculadora: ");
        Calculadora.soma(6, 3);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //empréstimo
        System.out.println("Empréstimo de: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        //mensagem
        System.out.println("Mensagem: ");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(0);
        Mensagem.obterMensagem(25);
    }
}
