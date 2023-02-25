package exercicios.oo.Heranca;

public class rodarAplicacaoFuncionario {
    
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //UPCAST
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();
        Funcionario vendedor1 = new Vendedor();

        //DOWNCAST
        //Gerente gerente2 = new Funcionario(); (forma errada)
        Vendedor vendedor2 = (Vendedor) new  Funcionario();
        
        System.out.println(vendedor1);
        System.out.println(vendedor2);
        System.out.println(faxineiro);
        System.out.println(funcionario);
        System.out.println(gerente);
    }
}
