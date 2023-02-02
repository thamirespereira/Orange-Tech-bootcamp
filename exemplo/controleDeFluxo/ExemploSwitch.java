package exemplo.controleDeFluxo;

public class ExemploSwitch {
    public static void main(String ... args) throws Exception{     

        switchSemana();
        switchNumero();
        switchFerias();

    }

    private static void switchSemana(int ... args){

        String dia = "Terça";
        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;

            case "Terça":
                System.out.println(3);
                break;

            case "Quarta":
                System.out.println(4);
                break;

            case "Quinta":
                System.out.println(5);
                break;

            case "Sexta":
                System.out.println(6);
                break;

            case "Sábado":
                System.out.println(7);
                break;

            case "Domingo":
                System.out.println(1);
                break;
    
            default:
                System.out.println("Dia inválido");
                break;
        }
    }

    private static void switchNumero(int ... args){

        int numero = 4;
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            
            case 4:
                System.out.println("Errado");
                break;

            case 5:
                System.out.println("Talvez");
                break;
        
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

    private static void switchFerias(int ... args){

        String mes = "Dezembro";
        switch (mes) {
            case "Janeiro":
                System.out.println("Férias");
                break;

            case "Julho":
                System.out.println("Férias");
                break;

            case "Dezembro":
                System.out.println("Férias");
                break;
        
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }
    
}
