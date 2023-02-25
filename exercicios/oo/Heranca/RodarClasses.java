package exercicios.oo.Heranca;

public class RodarClasses {
    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        //sobrescrita e polimorfismo
        for (ClasseMae classe : classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe : classes) {
                classe.metodo2();
        }
        
        System.out.println("");

        //sobrescrita
       ClasseFilha2 classeFilha2 = new ClasseFilha2();
       classeFilha2.metodo2();

    }
}
