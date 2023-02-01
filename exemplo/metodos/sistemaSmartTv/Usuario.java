package exemplo.metodos.sistemaSmartTv;

public class Usuario {
    public static void main(String [] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está liga? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar(); 
        System.out.println("A TV está liga? " + smartTv.ligada);

        smartTv.desligar(); 
        System.out.println("A TV está liga? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(4);
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
