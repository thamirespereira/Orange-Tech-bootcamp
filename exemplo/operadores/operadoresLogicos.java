package exemplo.operadores;

public class operadoresLogicos {
    
    public static void main(String [] args) throws Exception {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("as duas condições são verdadeiras");
        }
        
        if (condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        
    }
}
