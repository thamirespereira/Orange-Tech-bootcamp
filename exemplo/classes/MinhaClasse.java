public class MinhaClasse {
    
/**
 * @param args
 * @throws Exception
 */
public static void main(String [] args) throws Exception {

        String primeiroNome = "Thamires";
        String segundoNome = "Pereira";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome, " ");

        System.out.println(nomeCompleto); }

public static String nomeCompleto (String primeiroNome, String segundoNome, String string) {
        return primeiroNome.concat(" ").concat(segundoNome);
}
}