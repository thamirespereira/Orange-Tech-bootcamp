package exemplo.operadores;

public class ExemploSalario {
    public static void main(String [] args) throws Exception{

        double salarioMensal = 11893.50d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean salarioAlto = salarioMensal >= mediaSalario;

        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        boolean poucosDependentes = quantidadeDependentes < mediaDependentes;

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        boolean semAuxilio = (salarioAlto) || (poucosDependentes);

        System.out.println("Recebe auxílio " + recebeAuxilio);
        System.out.println("Não recebe auxílio " + semAuxilio);

    
    }
}
