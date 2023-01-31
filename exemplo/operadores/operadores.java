package exemplo.operadores;

public class operadores {
    
    public static void main(String [] args) throws Exception {

        int numeroUm = 1;
        int numeroDois = 2;

        boolean simNao = numeroUm == numeroDois;
        System.out.println("número um é igual ao número dois? " + simNao);

        simNao = numeroUm != numeroDois;
        System.out.println("número um é diferente do número dois? " + simNao);

        simNao = numeroUm > numeroDois;
        System.out.println("número um é maior que número dois? " + simNao);
    }
}
