package exemplo.operadores;

public class condicional {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String [] args) throws Exception {

        int a, b;
        a = 5;
        b = 6;

        String resultado = "";

        if (a==b)
            resultado = "verdadeiro";
        else 
            resultado = "falso";
        
        System.out.print(resultado);


    }
    
}
