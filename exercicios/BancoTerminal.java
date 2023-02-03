package exercicios;

public class BancoTerminal {
    public static void main(String [] args) throws Exception {

        double saldo = 25;
        double valorSolicitado = 18;

        saldo = 15;
        valorSolicitado = 22;

        if (saldo > valorSolicitado)
            saldo = saldo - valorSolicitado;
        else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println(saldo);
    }
}
